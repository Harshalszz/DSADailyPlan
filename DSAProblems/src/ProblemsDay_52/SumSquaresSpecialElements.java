package ProblemsDay_52;

public class SumSquaresSpecialElements {
    //https://leetcode.com/problems/sum-of-squares-of-special-elements/description/

    public static int sumOfSquares(int[] nums) {

        int res = 0;
        int j=1;

        for(int i=0;i<nums.length; i++){
            if(nums.length%j == 0){
                res += nums[j-1]*nums[j-1];
            }
            j++;
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(sumOfSquares(nums));

    }
}
