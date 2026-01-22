package ProblemsDay_228;

import java.util.Stack;

public class ValidateStackSequences {
//https://leetcode.com/problems/validate-stack-sequences/?envType=problem-list-v2&envId=array
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j =0;

        for(int val:pushed ) {
            st.push(val);
            while (!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

    }
}
