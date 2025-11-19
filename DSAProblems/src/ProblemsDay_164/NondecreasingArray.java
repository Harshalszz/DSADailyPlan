package ProblemsDay_164;

public class NondecreasingArray {

    //https://leetcode.com/problems/non-decreasing-array/?envType=problem-list-v2&envId=array
    public boolean checkPossibility(int[] nums) {
        // corner case
        if(nums == null || nums.length <= 1) return true;

        // the count of continuous non-decreasing sub-array
        int count = 0;
        int index = -1;

        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i - 1]){
                count++;
                index = i;
                if(count > 1) return false; // early exit
            }
        }

        if(count == 0) return true;

        if(index == 1 || index == n - 1) return true;

        if(nums[index + 1] >= nums[index - 1] || nums[index] >= nums[index - 2]) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
