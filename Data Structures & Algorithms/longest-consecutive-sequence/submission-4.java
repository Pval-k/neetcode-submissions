class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int max = 0;
        for(int num : nums){
            hash.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            if(hash.contains(nums[i]-1)){
                continue;
            } else{
                int count = 0;
                int curr = 0;
                while(hash.contains(nums[i] + count)){
                    curr++;
                    count++;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
