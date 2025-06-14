package ProblemsDay8;

public class IncreasingTripletSubsequence {
//https://leetcode.com/problems/increasing-triplet-subsequence/description/
    public static  boolean isIncreasingTripletSubsequence(int[] nums){
        int num1 = Integer.MAX_VALUE , num2 = Integer.MAX_VALUE;

        for( int n : nums){
            if(n<=num1){
                num1 = n;
            }else if(n<=num2){
                num2 = n;
            }else{
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {5,4,3,2,1};
        System.out.println(isIncreasingTripletSubsequence(nums));

    }
}
