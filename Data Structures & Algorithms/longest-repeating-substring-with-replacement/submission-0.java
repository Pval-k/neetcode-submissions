class Solution {
    public int characterReplacement(String s, int k) {
        //key: character, Value: frequency
        HashMap<Character, Integer> hash = new HashMap<>();
        //max freq is the freq of one character
        int max_freq = 0;
        //answer is the window that can contain other characters
        int answer = 0;
        int i = 0;
        int j = 0;

        while(j<s.length()){
            //calculate max frequency
            hash.put(s.charAt(j), hash.getOrDefault(s.charAt(j),0)+1);
            max_freq = Math.max(max_freq, hash.get(s.charAt(j)));

            //once we get max freq, check if window is within k
            while((j-i+1)-max_freq > k){
                hash.put(s.charAt(i), hash.get(s.charAt(i))-1);
                i++;
            }

            //update result
            answer = Math.max(answer, j-i+1);
            j++;
        }
        return answer;
    }
}
