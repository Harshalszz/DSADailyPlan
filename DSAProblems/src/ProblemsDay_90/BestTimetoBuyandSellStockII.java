package ProblemsDay_90;

public class BestTimetoBuyandSellStockII {

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    // public int maxProfit(int[] prices) {

    //     return slove(0, 1, prices);

    // }

    // public int slove(int index,int canBuy, int[] prices){

    //     if(index == prices.length){
    //         return 0;
    //     }

    //     int profit = 0;
    //     if(canBuy == 1){
    //         profit = Math.max(-prices[index] + slove(index+1, 0,prices), 0 + slove(index+1,1,prices));
    //     }else{
    //         profit = Math.max(prices[index] + slove(index+1, 1,prices), 0 + slove(index+1,0,prices));
    //     }

    //     return profit;
    // }

    public int maxProfit(int[] prices) {
        int profit = 0 ;

        for(int i=1 ; i<prices.length ; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1] ;
            }
        }
        return profit ;
    }

    public static void main(String[] args) {

    }
}
