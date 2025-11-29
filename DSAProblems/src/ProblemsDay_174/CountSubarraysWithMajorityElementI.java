package ProblemsDay_174;

public class CountSubarraysWithMajorityElementI {

    //https://leetcode.com/problems/count-subarrays-with-majority-element-i/?envType=problem-list-v2&envId=merge-sort
    public int countMajoritySubarrays(int[] nums, int target) {
        int res = 0;

        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] == target)count++;

                if((j-i+1)/2 < count){
                    res++;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
