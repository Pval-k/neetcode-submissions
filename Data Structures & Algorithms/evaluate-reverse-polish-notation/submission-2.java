class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String elem : tokens){
            if(elem.equals("+") ||
            elem.equals("-")  ||
            elem.equals("*")  ||
            elem.equals("/")  ){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                if(elem.equals("+")){
                    stack.push(String.valueOf(num1+num2));
                } else if(elem.equals("-")){
                    stack.push(String.valueOf(num1-num2));
                }else if(elem.equals("*")){
                    stack.push(String.valueOf(num1*num2));
                } else{
                    stack.push(String.valueOf(num1/num2));
                }
            } else{
                stack.push(elem);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
