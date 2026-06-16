class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //key: int[26], where each element represents the number of each letter
        //Value: list of anagrams that belong together
        HashMap<String, List<String>> hash = new HashMap<>();

        for(String word : strs){
            int[] word_arr = new int[26];
            for(char letter : word.toCharArray()){
                //array of numbers that represents the key
                word_arr[letter - 'a']++;
            }
            String key = Arrays.toString(word_arr);
            if(!hash.containsKey(key)){
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
