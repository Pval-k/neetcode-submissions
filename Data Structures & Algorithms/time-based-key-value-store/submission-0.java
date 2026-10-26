class TimeMap {
    HashMap<String, List<Pair>> map = new HashMap<>();

    class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int l = 0, r = list.size() - 1;
        String result = "";

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (list.get(m).timestamp <= timestamp) {
                result = list.get(m).value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return result;
    }
}