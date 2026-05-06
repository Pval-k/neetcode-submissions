class Solution {
    public String minWindow(String s, String t) {
        int[] key = new int[128];
        for(char c : t.toCharArray()){
            key[c]++;
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;

        while(right < s.length()){
            if(key[s.charAt(right)] > 0){
                required--;
            }
            key[s.charAt(right)]--;

            while(required == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
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
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start, start+ minLen);
        }
    }
}
