class Solution {
    public int lengthOfLongestSubstring(String s) {
        //key: character, value: last seen index
        HashMap<Character, Integer> hash = new HashMap<>();
        int i = 0;
        int j = 0;
        int cur_length = 0;
        int max_length = 0;

        while(j<s.length()){
            if(hash.containsKey(s.charAt(j))){
                //hash might contain something not in valid window
                i = Math.max(hash.get(s.charAt(j)) +1, i);
                cur_length = j-i;
            } 
            hash.put(s.charAt(j), j);
            cur_length++;
            max_length = Math.max(max_length, cur_length);
            j++;
        }
        return max_length;
    }
}
