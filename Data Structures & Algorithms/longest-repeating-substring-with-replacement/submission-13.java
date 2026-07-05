class Solution {
    public int characterReplacement(String s, int k) {
        int max_length = 0;
        int i = 0;
        int j = 0;
        int most_freq_char = 0;

        //Key: Character, Value: Frequency
        HashMap<Character, Integer> hash = new HashMap<>();

        while(j<s.length()){
            hash.put(s.charAt(j), hash.getOrDefault(s.charAt(j), 0)+1);
            most_freq_char = Math.max(most_freq_char, hash.get(s.charAt(j)));

            while((j-i+1)-most_freq_char>k){
                hash.put(s.charAt(i), hash.get(s.charAt(i))-1);
                i++;
            }
            
            max_length = Math.max(max_length, j-i+1);
            j++;
        }



        return max_length;
    }
}
