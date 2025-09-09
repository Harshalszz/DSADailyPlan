package ProblemsDay_95;

import java.util.Stack;

public class OnlineStockSpan {
    //https://leetcode.com/problems/online-stock-span/?envType=study-plan-v2&envId=leetcode-75

    class StockSpanner {

        Stack<int[]> stack;

        public StockSpanner() {
            stack = new Stack<>();

        }

        public int next(int price) {

            int res = 1;

            while(!stack.isEmpty() && stack.peek()[0] <= price){
                res += stack.pop()[1];
            }

            stack.push(new int[]{price , res});

            return res;

        }
    }

    public static void main(String[] args) {

    }
}
