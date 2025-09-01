package ProblemsDay_87;

public class FibonacciNumber {
    //https://leetcode.com/problems/fibonacci-number/

    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n ==1){
            return 1;
        }else{
            int a = 0;
            int b= 1;
            int index = 2;
            int sum = 0;

            while(index<=n){
                sum = a+b;

                index++;

                a=b;
                b=sum;
            }

            return sum;
        }

    }

    public static void main(String[] args) {

    }
}
