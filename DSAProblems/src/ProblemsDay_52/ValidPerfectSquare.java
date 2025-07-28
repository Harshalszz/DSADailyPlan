package ProblemsDay_52;

public class ValidPerfectSquare {
    //https://leetcode.com/problems/valid-perfect-square/

    public static boolean isPerfectSquare(int num) {

        //using binary search

        int start = 1;
        int end = num;

        while(start<=end){
            int mid = start + (end -start)/2;

            long midSq = (long) mid*mid;

            if(midSq==num){
                return true;
            }else if(midSq>num){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int num = 17;
        System.out.println(isPerfectSquare(num));

    }
}
