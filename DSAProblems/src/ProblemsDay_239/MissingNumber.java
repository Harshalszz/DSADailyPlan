package ProblemsDay_239;

public class MissingNumber {
// https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = (n *(n+1))/2;

        int sumArr = 0;
        for(int ni : nums){
            sumArr +=ni;
        }

        return sum - sumArr ;

    }
    public static void main(String[] args) {

    }
}
