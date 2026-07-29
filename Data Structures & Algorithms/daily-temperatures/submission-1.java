class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //[temp/elem,index]
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int cur_temp = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0] < cur_temp){
                int indx = stack.peek()[1];
                res[indx] = i - indx;
                stack.pop();
            }
            stack.push(new int[] {cur_temp, i});
        }
        return res;
    }
}
