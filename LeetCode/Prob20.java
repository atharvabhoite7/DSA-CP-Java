// Solution to problem number 20 of Leetcode

class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 !=0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if( ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else{
                if(!stack.isEmpty()){
                    char top = stack.peek();
                    if((top == '(' && ch ==')') || (top == '{' && ch =='}') || (top == '[' && ch == ']') ){
                        stack.pop();
                    } else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}