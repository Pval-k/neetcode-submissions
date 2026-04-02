class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        for(String word: strs){
            char[] wordarr = word.toCharArray();
            int[] sortedarr = new int[26];

            for(char letter : wordarr){
                sortedarr[letter - 'a']++;
            }
            String sortedword = Arrays.toString(sortedarr);
            hash.putIfAbsent(sortedword, new ArrayList<>());
            hash.get(sortedword).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
