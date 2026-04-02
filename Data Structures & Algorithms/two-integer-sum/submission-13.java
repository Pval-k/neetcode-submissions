class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int curr;
        int complement;
        for(int i = 0; i < nums.length; i++){
            curr = nums[i];
            complement = target - curr;

            if(hash.containsKey(complement)){
                return new int[] {hash.get(complement), i};
            }
            else{
                hash.put(curr, i);
            }
        }
        return new int[] {};
    }
}
