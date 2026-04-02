class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int complement = target- curr;
            if(!hash.containsKey(complement)){
                hash.put(curr, i);
            }
            else{
                return new int[] {hash.get(complement), i};
            }
        }
        return new int[] {};
    }
}
