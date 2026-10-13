class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = nums[l];

        while(l<r){
            int m = (l+r)/2;
            if(nums[m] < nums[r]){
                r = m;
            } else {
                l = m +1;
                min = nums[l];
            }
        }

        return min;
    }
}
