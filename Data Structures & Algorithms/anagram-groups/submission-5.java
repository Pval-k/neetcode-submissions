class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Key: sorted version --> alphabetical, arraylist [26]
        //Value: arraylist of the anagrams
        //
        Map<String, List<String>> hash = new HashMap<>();
        String key ;
        for(String word : strs){
            int[] count = new int[26];
            for(char letter : word.toCharArray()){
                count[letter-'a']++;
            }
                key = Arrays.toString(count);
                if(!hash.containsKey(key)){
                    hash.put(key, new ArrayList<>());
                }
                hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
