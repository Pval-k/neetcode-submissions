class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        String key;
        for(String word : strs){
            int[] coded_arr = new int[26];
            for(char letter : word.toCharArray()){
                coded_arr[letter-'a']++;
            }
            key = Arrays.toString(coded_arr);
            if(!hash.containsKey(key)){
                hash.put(key,new ArrayList<>());
            }
            hash.get(key).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
