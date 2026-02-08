package ProblemsDay_245;

public class MajorityElement {
//https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {

        int ans = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++){

            if(nums[i] ==ans){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                ans = nums[i];
                count = 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
