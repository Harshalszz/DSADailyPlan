package ProblemsDay_112;

public class CoinChange {
    //https://leetcode.com/problems/coin-change/?envType=study-plan-v2&envId=top-100-liked

    public int coinChange(int[] coins, int amount) {

        if(amount<1){
            return 0;
        }

        int[] coinDP = new int[amount +1];

        for(int i=1; i<=amount; i++){

            coinDP[i] = Integer.MAX_VALUE;

            for(int coin : coins){

                if(coin<= i && coinDP[i-coin] != Integer.MAX_VALUE){
                    coinDP[i] = Math.min(coinDP[i], 1+ coinDP[i-coin]);
                }
            }
        }

        if(coinDP[amount] == Integer.MAX_VALUE){
            return -1;
        }

        return coinDP[amount];



    }

    public static void main(String[] args) {

    }
}
