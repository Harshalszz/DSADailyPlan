package ProblemsDay_22;

public class BinarySubarraysWithSum {
//https://leetcode.com/problems/binary-subarrays-with-sum/
    public static int binarySubarraysWithSum(int[] nums, int goal){

        if(goal<0){
            return 0;
        }

        int l=0,r=0,sum=0,count=0;

        while(r<nums.length){

            sum += nums[r];

            while(sum>goal){
                sum -= nums[l];
                l++;
            }

            count += r-l+1;

            r++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int a = binarySubarraysWithSum(nums,goal); //counting every posisbel sub array where sum is equal or leass that goal;
        int b = binarySubarraysWithSum(nums,goal-1);// counting the everu psosible subarray where sum is equal or less that goal-1;
        // count for sum == goal =>> count(sum<=goal) - count(sum<= goal-1);

        System.out.println(a-b);

    }
}
