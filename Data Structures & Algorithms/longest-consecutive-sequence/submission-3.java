class Solution {
    public int longestConsecutive(int[] nums) {
        //We want to use hashmap bc we can just ask if it contains x in low time
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums){
            hash.add(num);
        }
        int max_seqlen = 0;
        for(int num : nums){
            if(!hash.contains(num-1)){
                int next_num = num+1;
                int curr_seqlen = 1;
                while(hash.contains(next_num)){
                    curr_seqlen++;
                    next_num++;
                }
                max_seqlen = Math.max(max_seqlen, curr_seqlen);
            }
        }
        return max_seqlen;
    }
}
