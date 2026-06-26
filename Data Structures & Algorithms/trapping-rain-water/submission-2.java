class Solution {
    public int trap(int[] height) {
        //output: total area of all the water

        int i = 0;
        int j = height.length-1;

        int maxL = height[i];
        int maxR = height[j];

        int total = 0;

        while(i<j){
            if(height[i]<height[j]){
                i++;
                maxL = Math.max(maxL, height[i]);
                total += maxL - height[i];
            }
            else{
                j--;
                maxR = Math.max(maxR, height[j]);
                total += maxR - height[j];
            }
        }

        return total;
    }
}
