class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1_arr = s1.toCharArray();
        Arrays.sort(s1_arr);

        int window_size = s1.length();
        int i = 0;
        int j = i+window_size-1;
        while(j<s2.length()){
            char[] s2_window = s2.substring(i,j+1).toCharArray();
            Arrays.sort(s2_window);

            if(Arrays.equals(s1_arr, s2_window)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
