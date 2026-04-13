class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int answer = 0;
        int i = 0;
        int j = 0;
        while(j<s.length()){
            if(hash.containsKey(s.charAt(j))){
                // is the other option because 
                //what if we see a character that isn't in the window
                //it counts as a duplicate so make sure it is outside window
                //by making sure it is greater than i
                i = Math.max(i, hash.get(s.charAt(j)) + 1); 
                
            }
            hash.put(s.charAt(j), j);
            answer = Math.max(answer, j-i+1);
            j++;

        }
        return answer;
    }
}
