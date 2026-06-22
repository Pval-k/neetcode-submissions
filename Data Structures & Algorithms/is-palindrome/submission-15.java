class Solution {
    public boolean isPalindrome(String s) {
        //palindrome --> true
        //case INsensitive
        s = s.toLowerCase();
        
        int i = 0;
        int j = s.length()-1;

        if(s.length() == 1){
            return true;
        }

        while(i<j){
            
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }

        }

        return true;
        
    }
}
