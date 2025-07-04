package ProblemsDay_28;


public class HouseRobberII {
//https://leetcode.com/problems/house-robber-ii/description/
        public static int getMax(int[] nums,int start, int end){
            int prevMax =0,currMax=0;

            for(int i=start;i<=end;i++){
                int temp =Math.max(currMax,prevMax+nums[i]);
                prevMax=currMax;
                currMax=temp;
            }

            return currMax;
        }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int n = nums.length;
        int ans = Math.max(getMax(nums,0,n-2), getMax(nums, 1,n-1));

        System.out.println(ans);
    }
}
