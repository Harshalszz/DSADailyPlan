package ProblemsDay_19;

import java.util.Stack;

public class P132Pattern {
//https://leetcode.com/problems/132-pattern/description/
    public static boolean solution(int[] nums){
        Stack<int[]> st = new Stack<>();
        int cur_min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            while (!st.isEmpty() && n >= st.peek()[0]) {
                st.pop();
            }

            if (!st.isEmpty() && n > st.peek()[1]) {
                return true;
            }

            st.push(new int[] { n, cur_min });
            cur_min = Math.min(cur_min, n);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums ={1,2,3,4};

        System.out.println(solution(nums));

    }
}
