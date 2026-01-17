package ProblemsDay_223;

import java.util.Stack;

public class MinimumCostTreeFromLeafValues {

    //https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/?envType=problem-list-v2&envId=monotonic-stack
    public int mctFromLeafValues(int[] arr) {
        int result = 0;
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE); // sentinel so stack is never empty

        for (int a : arr) {
            while (st.peek() <= a) {
                int mid = st.pop();
                result += mid * Math.min(st.peek(), a);
            }
            st.push(a);
        }

        // Merge remaining elements in stack
        int first = st.pop();
        while (st.size() > 1) { // leave sentinel
            result += first * st.peek();
            first = st.pop();
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
