class Solution {
    public int trap(int[] height) {
        //2 pointers-one at each end
        //find the max height on left and right. 
        //we move the pointer that had the smaller max height
            //we know the water next to it will mostly be filled to that height 
            //since the other max height is bigger
            //or there is a block taller than it

        int i = 0;
        int j = height.length-1;
        int leftMax = height[i];
        int rightMax = height[j];
        int total = 0;

        while(i<j){
            if(leftMax < rightMax){
                i++;
                leftMax = Math.max(leftMax,height[i]);
                total += leftMax - height[i];
            }
            else{
                j--;
                rightMax = Math.max(rightMax,height[j]);
                total += rightMax - height[j];
            }
        }
        return total;
    }
}
