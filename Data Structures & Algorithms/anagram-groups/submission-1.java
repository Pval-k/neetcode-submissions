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

//must turn word to char array then to string
//remeber:
//String to char[] --> word.toCharArray()
//char[] to String --> Arrays.toString(sortedarr);
//hash.putIfAbsent(sortedword, new ArrayList<>());
//return all values of hash --> return new ArrayList<>(hash.values());