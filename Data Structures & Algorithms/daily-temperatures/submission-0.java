public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                res[stack.peek()[1]] = i- stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[] {temperatures[i], i});
        }
        return res;
    }
}