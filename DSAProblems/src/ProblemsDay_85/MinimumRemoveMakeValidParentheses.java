package ProblemsDay_85;

import java.util.Stack;

public class MinimumRemoveMakeValidParentheses {
    //https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
    public String minRemoveToMakeValid(String s) {

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<sb.length() ; i++){

            if(sb.charAt(i) == '('){
                stack.push(i);
            }else if(sb.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    sb.setCharAt(i, '*'); // marking extra ')'
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {

    }
}
