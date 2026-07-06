class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()){
            return "";
        }

        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            targetFreq.put(t.charAt(i), targetFreq.getOrDefault(t.charAt(i), 0) + 1);
        }

        int i = 0;
        int j = 0;
        int chars_found = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        while (j < s.length()) {
            if (targetFreq.containsKey(s.charAt(j))) {
                if (targetFreq.get(s.charAt(j)) > 0) chars_found++;
                targetFreq.put(s.charAt(j), targetFreq.get(s.charAt(j)) - 1);
            }
            j++;

            while (chars_found == t.length()) {
                if (j - i < minLen) {
                    minLen = j - i;
                    result = s.substring(i, j);
                }

                if (targetFreq.containsKey(s.charAt(i))) {
                    targetFreq.put(s.charAt(i), targetFreq.get(s.charAt(i)) + 1);
                    if (targetFreq.get(s.charAt(i)) > 0){
                        chars_found--;
                    } 
                }
                i++;
            }
        }
        return result;
    }
}