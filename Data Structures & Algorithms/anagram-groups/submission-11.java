class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Key: version/code that represents all the anagrams that belong to that group
        //Value: List of words that are anangrams

        //Key: 
        //1. alphebetizing the words in the anagram group --> Array.sort
        //2. 26 element int[] 
        Map<String,List<String>> hash = new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            for(char letter : word.toCharArray()){
                count[letter - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!hash.containsKey(key)){
                hash.put(key, new ArrayList<>());
            }
            hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());

    }
}
