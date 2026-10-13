class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(l<=r){
            int m = (l+r)/2;
            //which side is sorted cleanly
            if(nums[m] <= nums[r]){
                //right side is sorted cleanly
                r = m-1;
                min = Math.min(min, nums[m]);
            } else {
                //left side is sorted cleanly
                l = m+1;
                 min = Math.min(min, nums[m]);
            }
        }
        return min;


    }
}
