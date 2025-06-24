package ProblemsDay_18;

import java.util.Stack;

public class EvaluateReversePolishNotation {
//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
    public static int evaluateReversePolishNotation(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(c.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2-num1);
            }else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if( c.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2/num1);
            }else{
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        String[] s  ={"2","1","+","3","*"};
        System.out.println(evaluateReversePolishNotation(s));

    }
}
