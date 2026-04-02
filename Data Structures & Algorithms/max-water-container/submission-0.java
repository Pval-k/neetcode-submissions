class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        while(left<right){
            int height = Math.min(heights[left], heights[right]);
            int width = right-left;
            int curr_vol = height * width;
            max = Math.max(max, curr_vol);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
        
        
    }
}
