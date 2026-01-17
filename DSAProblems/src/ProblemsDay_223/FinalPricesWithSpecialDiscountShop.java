package ProblemsDay_223;

import java.util.ArrayDeque;
import java.util.Deque;

public class FinalPricesWithSpecialDiscountShop {

    //https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/?envType=problem-list-v2&envId=monotonic-stack
    public int[] finalPrices(int[] prices) {
        int[] ans = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = 0; j < prices.length; ++j) {
            // stack[-1] := i in the problem description.
            while (!stack.isEmpty() && prices[j] <= prices[stack.peek()])
                ans[stack.pop()] -= prices[j];
            stack.push(j);
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
