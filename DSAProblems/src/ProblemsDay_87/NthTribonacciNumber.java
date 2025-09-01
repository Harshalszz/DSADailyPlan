package ProblemsDay_87;

public class NthTribonacciNumber {

    //https://leetcode.com/problems/n-th-tribonacci-number/?envType=study-plan-v2&envId=leetcode-75

    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }else if(n<=2){
            return 1;
        }else{

            int a =0;
            int b=1;
            int c= 1;
            int index = 3;
            int sum = 0;

            while(index<= n){
                sum = a+b+c;
                index++;

                a=b;
                b=c;
                c=sum;
            }

            return sum;
        }

    }

    public static void main(String[] args) {

    }
}
