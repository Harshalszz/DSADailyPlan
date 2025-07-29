package ProblemsDay_53;

public class CheckDivisibilityDigitSumandProduct {
    //https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

    public static boolean checkDivisibility(int n) {

        int sum =0;
        int prod = 1;
        int x = n;

        while(x>0){
            int temp = x%10;
            sum +=temp;
            prod *=temp;
            x=x/10;
        }

        return n%(sum+prod) == 0;

    }

    public static void main(String[] args) {

        int n= 99;
        System.out.println(checkDivisibility(n));

    }
}
