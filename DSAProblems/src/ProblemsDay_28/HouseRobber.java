package ProblemsDay_28;

public class HouseRobber {
//https://leetcode.com/problems/house-robber/description/
    public static int houseRobber(int[] nums){

        int prevMax=0, currMax=0;

        for(int i=0; i<nums.length;i++){
            int temp = Math.max(currMax, prevMax+nums[i]);
            prevMax=currMax;
            currMax=temp;
        }

        return currMax;
    }

    public static void main(String[] args) {

        int[] nums ={2,7,9,3,1};

        System.out.println(houseRobber(nums));

    }
}
