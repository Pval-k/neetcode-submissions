class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(l<=r){
            int m = (l+r)/2;
            if(nums[m] <= nums[r]){
                //right side of the array is sorted
                
                r = m - 1;
                min = Math.min(min, nums[m]);
                
            } else{
                //left side of the array is sorted
                l = m + 1;
                min = Math.min(min, nums[l]);
                
                
            }
        }
        return min;
    }
}

//min = 5
//
