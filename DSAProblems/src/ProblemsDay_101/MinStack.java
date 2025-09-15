package ProblemsDay_101;

import java.util.Stack;

public class MinStack {

    //https://leetcode.com/problems/min-stack/?envType=study-plan-v2&envId=top-interview-150

    Stack<Integer> stack ;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }

    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }

        stack.pop();

    }

    public int top() {

        return stack.isEmpty() ? -1 : stack.peek();

    }

    public int getMin() {

        return minStack.isEmpty() ? -1 : minStack.peek();

    }



    public static void main(String[] args) {

    }
}
