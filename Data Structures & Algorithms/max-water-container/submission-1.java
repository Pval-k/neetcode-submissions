class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max_vol = 0;

        while(i<j){
            int cur_vol;
            int left = heights[i];
            int right = heights[j];
            cur_vol = Math.min(left,right)*(j-i);
            max_vol = Math.max(cur_vol, max_vol);

            //move pointers
            if(left>right){
                j--;
            }
            else{
                i++;
            }
        }
        return max_vol;
    }
}
