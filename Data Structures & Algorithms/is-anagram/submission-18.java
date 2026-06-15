class Solution {
    public boolean isAnagram(String s, String t) {
        if(!(s.length() == t.length())){
            return false;
        }
        else{
            char[] s_arr = new char[26];
            char[] t_arr = new char[26];

            for(char letter : s.toCharArray()){
                s_arr[letter - 'a']++;
            }
            for(char letter : t.toCharArray()){
                t_arr[letter - 'a']++;
            }

            String s_string = Arrays.toString(s_arr);
            String t_string = Arrays.toString(t_arr);

            if(s_string.equals(t_string)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
