public class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        //create char array for key
        int[] key = new int[128];

        //fill key
        for(int i = 0; i < t.length(); i++){
            key[t.charAt(i)]++;
        }

        //pointers + res comparator
        int left = 0;
        int right = 0;
        int start = 0;
        int required = t.length();
        int minLength = Integer.MAX_VALUE;

        while(right < s.length()){
            if(key[s.charAt(right)] > 0){
                required--;
            }
            //make the key negative in elements we don't find in key or if frequncy is 0
            //why
            key[s.charAt(right)]--;

            //when all the characters are found
            while(required == 0){
                //compare with minlength and update start so we know what to return
                if(right - left + 1 < minLength){
                    minLength = right - left + 1;
                    start = left;
                }

                key[s.charAt(left)]++;
                if(key[s.charAt(left)] > 0){
                    required++;
                }
                
                left++;
                
            }
            right++;

        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
        
    }
}