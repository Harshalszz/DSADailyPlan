package ProblemsDay_159;

public class FindMinimumOperationsMakeAllElementsDivisibleThree {

    //https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/
    public int minimumOperations(int[] nums) {

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0)
                continue;
            else
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
