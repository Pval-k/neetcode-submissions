class Solution {
    public int characterReplacement(String s, int k) {
        //We start with a slding window
        //In that current window, we want the max freq of the element
            //Do this through HashMap
        //If the window size - the max freq char is more than k, 
            //decrease window + update hash
        //Increase j, max substring update

        //Key: Char, Value: Frequency of char
        HashMap<Character, Integer> hash = new HashMap<>();
        int i = 0;
        int j = 0;
        int max_length = 0;
        int max_freq = 0;

        while(j<s.length()){
            hash.put(s.charAt(j), hash.getOrDefault(s.charAt(j), 0) + 1);
            max_freq = Math.max(max_freq, hash.get(s.charAt(j)));

            while(j<s.length() && j-i+1 - max_freq > k){
                //remove i from hash and window to move window
                hash.put(s.charAt(i), hash.get(s.charAt(i))-1);
                i++;
            }
            max_length = Math.max(max_length, j-i+1);
            j++;
        }
        return max_length;
        
    }
}
