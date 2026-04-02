class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        //1. create arrary called answer and fill it with 1s
        for(int i = 0; i < nums.length; i++){
            answer[i] = 1;
        }
        
        //2. one loop that takes care of multiplying the left side of each element
        int left = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] *= left;
            left *= nums[i];
        }
        
        //3. one loop that takes care of multiplying the left side of each element
        int right = 1;
        for(int i = nums.length-1; i >= 0; i--){
            answer[i] *= right;
            right *= nums[i];

        }
        return answer;
        
    }
}  
