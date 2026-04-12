class Solution {
    public int lengthOfLongestSubstring(String s) {
        //put if statement as unique case (not normal)
        HashMap<Character, Integer> hash = new HashMap<>();
        int i = 0;
        int j = 0;
        int max_length = 0;
        int curr_length = 0;
        while(j<s.length()){

            if(hash.containsKey(s.charAt(j))){
                //i = hash.get(s.charAt(j))+1;
                i = Math.max(i, hash.get(s.charAt(j)) + 1);
               

            }
            //else{
                hash.put(s.charAt(j), j);
                curr_length = j-i+1;
                max_length = Math.max(max_length, curr_length);
                j++;
           // }
            
            
        }
        return max_length;
    }
}
