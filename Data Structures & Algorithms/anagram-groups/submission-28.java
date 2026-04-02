class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        //Key: code of the list of anagrams that belong: 26 letter string: 013
        //Value: List of anagrams that belong together
        for(String word : strs){
            int[] key_arr = new int[26];
            for(char letter : word.toCharArray()){
                key_arr[letter - 'a']++;
            }
            String key = Arrays.toString(key_arr);
            if(!hash.containsKey(key)){
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}