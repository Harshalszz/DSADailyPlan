package ProblemsDay_74;

public class FindPivotIndex {
    //https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75

    public int pivotIndex(int[] nums) {

        int rightSum = 0, leftSum = 0;

        for(int n : nums){
            rightSum +=n;
        }

        for(int i=0; i<nums.length; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;

    }

    public static void main(String[] args) {

    }
}
