class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        String key;
        for(String word : strs){
            int[] key_arr = new int[26];
            for(char letter : word.toCharArray()){
                key_arr[letter-'a']++;
            }
            key = Arrays.toString(key_arr);
            hash.putIfAbsent(key, new ArrayList<>());
            hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
