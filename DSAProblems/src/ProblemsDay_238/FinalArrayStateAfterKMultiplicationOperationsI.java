package ProblemsDay_238;

public class FinalArrayStateAfterKMultiplicationOperationsI {

    //https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while(k >0){

            int num = nums[0];
            int indx =0;

            for(int i=1 ; i<nums.length; i++){

                if(nums[i] < num){
                    num = nums[i];
                    indx = i;
                }
            }

            nums[indx] = nums[indx] * multiplier;
            k--;
        }

        return nums;

    }
    public static void main(String[] args) {

    }
}
