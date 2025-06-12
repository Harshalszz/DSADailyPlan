package ProblemsDay6;

public class SingleNumber {
//https://leetcode.com/problems/single-number/description/
    public static  int singleNumber(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }

        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            res = res^nums[i];
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

    }
}
