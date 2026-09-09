class Solution {
    public boolean isValid(String s) {
        //closed parenthesis --> check stack
            //if empty -->false
            //else: make sure it is the corresponding parenthesis
                //if it is --> true then pop
                //if not --> false
        //open Parethesis --> stack
        //Make sure stack is not empty


        Stack<Character> stack = new Stack<>();
        for(char elem : s.toCharArray()){
            if(elem == '(' || elem == '{' || elem == '['){
                stack.push(elem);
            } else{
                if(stack.isEmpty()){
                    return false;
                } else{
                    char c = stack.peek();
                    if(c == '(' && elem == ')' ||
                    c == '{' && elem == '}' ||
                    c == '[' && elem == ']' ) {
                        stack.pop();
                    } else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
