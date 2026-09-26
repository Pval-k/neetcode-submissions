class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] matrix = new int[n][2];
        
        for(int i = 0; i < n; i++){
            matrix[i][0] = position[i];
            matrix[i][1] = speed[i];
        }

        Arrays.sort(matrix, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            double time = (double)(target - matrix[i][0]) / matrix[i][1];
            
            if(stack.isEmpty()){
                stack.push(time);
            } else {
                if(time > stack.peek()){
                    stack.push(time);
                }
            }
        }
        
        return stack.size();
    }
}