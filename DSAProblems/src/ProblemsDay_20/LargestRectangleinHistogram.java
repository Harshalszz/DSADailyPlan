package ProblemsDay_20;

import java.util.Stack;

public class LargestRectangleinHistogram {
//https://leetcode.com/problems/largest-rectangle-in-histogram/description/
    public static int largestRectangleinHistogram(int[] heights){
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<heights.length ; i++){

            while (!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                int ele = stack.peek();
                stack.pop();
                int nse = i; //next smallest element
                int pse = stack.isEmpty() ? -1:stack.peek(); // previors smallest element

                maxArea = Math.max(maxArea , heights[ele] *(nse - pse -1));
            }

            stack.push(i);
        }
        int nse = heights.length; // as there will be no next smllest element for remaing element in the stack;
        while(!stack.isEmpty()){
            int ele = stack.peek();
            stack.pop();
            int pse = stack.isEmpty() ? -1: stack.peek();

            maxArea = Math.max(maxArea, heights[ele]*(nse - pse -1));
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] nums = {2,1,5,6,2,3};

        System.out.println(largestRectangleinHistogram(nums));

    }
}
