package ProblemsDay_52;

public class SumofSquareNumbers {
    //https://leetcode.com/problems/sum-of-square-numbers/
    public static boolean judgeSquareSum(int c) {

        long left = 1;
        long right = (long) Math.sqrt(c);
        if(right * right == c){
            return true;
        }

        while(left<=right){
            long sum = left*left + right*right;

            if(sum == c){
                return true;
            }
            if(sum > c){
                right--;
            }
            left++;

        }

        return false;


    }

    public static void main(String[] args) {
        int c = 6;
        System.out.println(judgeSquareSum(c));
    }
}
