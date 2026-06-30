class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int max_length = 0;

        int i = 0;
        int j = 0;

        while(j<s.length()){
            while(hash.contains(s.charAt(j))){
                //there exists a duplicate in this condition

                //move i until the substring doesn't contain a duplicate
                //move at indexOf(s.charAt(j), i)+1
                //length, compare it to max length
                hash.remove(s.charAt(i));
                i++;
                
                
            }
            int length = j-i+1;
            max_length = Math.max(max_length, length);
            hash.add(s.charAt(j));
            j++;
        }
        return max_length;
    }
}
