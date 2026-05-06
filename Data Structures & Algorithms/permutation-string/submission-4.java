class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] key = new int[26];
        int[] window = new int[26];

        for(int i = 0; i < s1.length(); i++){
            key[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(key,window)){
            return true;
        }
        int left = 0;
        int right = s1.length();

        while(right<s2.length()){
            window[s2.charAt(right)-'a']++;
            window[s2.charAt(left)-'a']--;

            if(Arrays.equals(key,window)){
                return true;
            }
            right++;
            left++;
        }
        return false;
    }
}
