package ProblemsDay_81;

public class SubtractProductandSumDigitsInteger {
    //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

    public int subtractProductAndSum(int n) {

        int prod = 1;
        int sum = 0;

        while(n>0){
            int num = n%10;
            prod *= num;
            sum += num;
            n=n/10;
        }

        return prod - sum;

    }

    public static void main(String[] args) {

    }
}
