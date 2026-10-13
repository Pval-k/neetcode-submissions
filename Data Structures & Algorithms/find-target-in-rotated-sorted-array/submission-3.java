class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        
        while(l<=r){
            int m = (l+r)/2;
            if( nums[m] == target){
                return m;
            }
            //find which side is sorted cleanly
            else if(nums[m] >= nums[l]){
                //the left side is sorted cleanly
                //now check if the target is in this side of the array
                if(target <= nums[m] && target >= nums[l]){
                    r = m-1;
                } else{
                    l = m+1;
                }
            } else {
                //the right side is sorted cleanly
                //now check if the target is in this side of the array
                if(target >= nums[m] && target <= nums[r]){
                    l = m+1;
                } else{
                    r = m-1;
                }
            }
        }
        return -1;
    }
}
