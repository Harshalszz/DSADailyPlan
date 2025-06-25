package ProblemsDay_19;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
//https://leetcode.com/problems/daily-temperatures/description/
    public static int[] dailyTemperatures(int[] temperatures){

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(nums)));

    }
}
