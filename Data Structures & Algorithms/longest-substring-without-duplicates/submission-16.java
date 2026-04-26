class Solution {
    public int lengthOfLongestSubstring(String s) {
        //ey: character, value: index we say the char at
        HashMap<Character, Integer> hash = new HashMap<>();
        int i = 0;
        int j = 0;
        int max_length = 0;
        int length = 0;

        while(j<s.length()){

            if(hash.containsKey(s.charAt(j))){
                //i needs to be placed the char after the seen repeated char
                //get last seen index + 1
                i=Math.max(i, hash.get(s.charAt(j))+1);
                length = j-i;
            } 
            hash.put(s.charAt(j), j);
            length++;
            max_length = Math.max(max_length, length);
            j++;
            

        }
        return max_length;
    }
}
