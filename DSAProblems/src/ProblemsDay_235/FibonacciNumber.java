package ProblemsDay_235;

public class FibonacciNumber {

    //https://leetcode.com/problems/fibonacci-number/
    public int fib(int n) {

        if(n<=1){
            return n;
        }
        int i = fib(n-1);
        int j = fib(n-2);

        return i+j;

    }
    public static void main(String[] args) {

    }
}
