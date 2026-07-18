class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        //Key: Element, Value: Index
        HashMap<Character, Integer> hash = new HashMap<>();

        int i = 0;
        int j = 0;

        //increase the window: incrementally
        //decrease the window: when we find a repeated character in our window --> place i at last repeated char

        while(j<s.length()){
            if(hash.containsKey(s.charAt(j))){
                //Increment i so that the pointer is one ahead the last seen repeated char
                i = Math.max(hash.get(s.charAt(j)) +1 ,i);
            }
            hash.put(s.charAt(j), j);
            maxLen = Math.max(j-i+1, maxLen);
            j++;
        }
        return maxLen;
    }
}
