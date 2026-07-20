class Solution {
    public boolean isValid(String s) {
        //There are more open brackets than there are closed
        //There are more closed brackets  than there are open
        //The corresponding bracket is not the right type of bracket
        //It starts off with a closed bracket

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else{
                if(stack.isEmpty()){
                    return false;
                } else{
                    char top = stack.peek();

                    if(c == ')' && top != '(' ||
                    c == '}' && top != '{' ||
                    c == ']' && top != '[' ){
                        return false;
                    }
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
