class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> shash = new HashMap<>();
        HashMap<Character,Integer> thash = new HashMap<>();
        //Key: char
        //Value: Frequency
        if(s.length() != t.length()){
            return false;
        }
        else{
            for(char letter : s.toCharArray()){
                shash.put(letter,shash.getOrDefault(letter,0)+1);
            }
            for(char letter : t.toCharArray()){
                thash.put(letter,thash.getOrDefault(letter,0)+1);
            }
        }
        return shash.equals(thash);
    }
}
