class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Store result in hashmap
        //Key: a word that represents the list of anagrams
        //Value: List of anagrams of the group

        HashMap<String, List<String>> hash = new HashMap<>();
        for(String word : strs){
            int[] key_word_arr = new int[26];
            for(char letter : word.toCharArray()){
                key_word_arr[letter - 'a']++;
            }
            String key_word = Arrays.toString(key_word_arr);
            //If keyword is not already in the HM, add it, then add the word to the group of anagrams 
            //If it is, just add the word to the group of anagrams 
            if(!hash.containsKey(key_word)){
                hash.put(key_word, new ArrayList<>());
            }
            hash.get(key_word).add(word);
        }
        return new ArrayList<>(hash.values());

    }
}
