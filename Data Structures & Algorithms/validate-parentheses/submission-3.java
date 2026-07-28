class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //push: opening brackets
        //if it is closed, i will check if its the correct closed bracket by peeking 
            //pop
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char cur = s.charAt(i);
                char top = stack.peek();
                if((cur == ')' && top == '(') ||
                    (cur == '}' && top == '{') ||
                    (cur == ']' && top == '[') 
                ){
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
