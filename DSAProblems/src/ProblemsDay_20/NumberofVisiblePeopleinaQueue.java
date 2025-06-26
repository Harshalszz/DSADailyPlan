package ProblemsDay_20;

import java.util.Arrays;
import java.util.Stack;

public class NumberofVisiblePeopleinaQueue {
//https://leetcode.com/problems/number-of-visible-people-in-a-queue/description/
    public static int[] numberofVisiblePeopleinaQueue(int[] heights){
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        res[n-1] = 0;
        stack.push(heights[n-1]);

        for(int i= n-2; i>=0; i--){
            int count = 0;

            while(!stack.isEmpty() && stack.peek() < heights[i]){
                stack.pop();
                count++;
            }

            if(stack.isEmpty()){
                res[i] = count;
            }else{
                res[i] = count +1;
            }

            stack.push(heights[i]);
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = {10,6,8,5,11,9};

        System.out.println(Arrays.toString(numberofVisiblePeopleinaQueue(nums)));

    }
}
