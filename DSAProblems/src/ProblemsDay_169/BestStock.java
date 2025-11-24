package ProblemsDay_169;

public class BestStock {
    public int maxProfit(int[] prices) {

        int minValue = prices[0];
        int resultProfit = 0;

        for(int i=1; i<prices.length;i++){

            resultProfit = Math.max(resultProfit, prices[i] - minValue);
            minValue = Math.min(minValue,prices[i]);
        }

        return resultProfit;

    }
    public static void main(String[] args) {

    }
}
