class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int max_seq = 0;
        for(int i = 0; i < nums.length; i++){
            hash.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(hash.contains(curr-1)){
                continue;
            }
            else{
                int increment = 1;
                int curr_seq = 1;
                while(hash.contains(curr+increment)){
                    curr_seq++;
                    increment++;
                }
                max_seq = Math.max(max_seq, curr_seq);
            }
        }
        return max_seq;

    }
}
