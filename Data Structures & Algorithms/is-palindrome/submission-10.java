class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(!(s.substring(i,i+1).equals(s.substring(j,j+1)))){
                return false;
            }
            i++;
            j--;
        }
        return true;
        

    }
}
