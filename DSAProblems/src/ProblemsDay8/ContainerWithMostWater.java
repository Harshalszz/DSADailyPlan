package ProblemsDay8;

public class ContainerWithMostWater {
//https://leetcode.com/problems/container-with-most-water/description/
    public static  int containerWithMostWater(int nums[]){
        int l =0, r = nums.length - 1;
        int res = 0;

        while (l<r){
            if(nums[l] < nums[r]){
                res = Math.max(res,(r-l)* nums[l]);
                l++;
            }else{
                res = Math.max(res,(r-l)* nums[r]);
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1,8,6,2,5,4,8,3,7};

        System.out.println(containerWithMostWater(nums));

    }
}
