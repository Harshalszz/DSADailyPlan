package ProblemsDay2;

public class BestTimetoBuyandSellStock {
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public static int maxProfitMade(int[] prices){
        int minimum = prices[0];
        int profit = 0;

        for (int i=1; i<prices.length; i++){

            profit = Math.max(profit, prices[i]-minimum);
            minimum = Math.min(minimum,prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitMade(prices));

    }
}
