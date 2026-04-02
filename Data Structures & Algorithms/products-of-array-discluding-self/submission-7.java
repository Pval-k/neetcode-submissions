class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[nums.length];

        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < n; i++) {
            answer[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
        
    }
}  
//left/right is the product of all the terms to the left/right
//then we update left/right by multiplying its number nums[i]
//Since its product except self, we first update answer[i], before addings its own product to left/right
