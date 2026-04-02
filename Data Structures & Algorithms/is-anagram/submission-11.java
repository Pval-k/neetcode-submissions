class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hash_s = new HashMap<>();
        HashMap<Character,Integer> hash_t = new HashMap<>();

        for(char letter : s.toCharArray()){
            hash_s.put(letter, hash_s.getOrDefault(letter,0)+1);
        }
        for(char letter : t.toCharArray()){
            hash_t.put(letter, hash_t.getOrDefault(letter,0)+1);
        }
        return hash_s.equals(hash_t);
    }
}
