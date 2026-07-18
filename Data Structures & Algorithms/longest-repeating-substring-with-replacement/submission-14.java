class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        //Key: Element, Value: Freq
        HashMap<Character, Integer> hash = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxFreq = 0;

        //increase the window: incrementally 
            //increase char freq in hash
            //- we check the highest freq char --> determines how many chars need to be changed
        //decrease the window: when we do k replacements and we can't replace any more chars
            //decrease char freq in hash

        while(j < s.length()){
            hash.put(s.charAt(j), hash.getOrDefault(s.charAt(j), 0) +1);
            maxFreq = Math.max(maxFreq, hash.get(s.charAt(j)));

            while(j-i+1 - maxFreq > k){
                //remove freq from hash
                //i++
                hash.put(s.charAt(i), hash.get(s.charAt(i))-1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;

    }
}
