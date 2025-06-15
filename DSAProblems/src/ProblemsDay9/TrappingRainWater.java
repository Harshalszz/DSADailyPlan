package ProblemsDay9;

public class TrappingRainWater {
//https://leetcode.com/problems/trapping-rain-water/description/
    public static int trappingRainWater(int[] nums){
        int leftMax = 0 , rightMax = 0 , res = 0;
        int l = 0 , r= nums.length -1 ;

        while(l<r){

            if(nums[l] <= nums[r]){
                if(nums[l] < leftMax){
                    res += leftMax - nums[l];
                }else{
                    leftMax = nums[l];
                }

                l++;
            }else{
                if(nums[r] <rightMax){
                    res += rightMax - nums[r];
                }else{
                    rightMax= nums[r];
                }
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(nums));

    }
}
