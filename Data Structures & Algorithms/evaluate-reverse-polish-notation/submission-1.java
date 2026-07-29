class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String elem : tokens){
            if(elem.equals("+") || elem.equals("-") || elem.equals("*") || elem.equals("/")){
                if(stack.isEmpty()){
                    
                } else{
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    if(elem.equals("+")){
                        stack.push(num1+num2);
                    }
                    else if(elem.equals("-")){
                        stack.push(num1-num2);
                    }
                    else if(elem.equals("*")){
                        stack.push(num1*num2);
                    }
                    else if(elem.equals("/")){
                        stack.push(num1/num2);
                    }
                }
            } else{
                int val = Integer.parseInt(elem);
                stack.push(val);
            }
        }
        return stack.pop();
    }
}
