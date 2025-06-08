package ProblemsDay2;

import java.util.Arrays;

public class SortColors {
//https://leetcode.com/problems/sort-colors/description/
    public static int[] sortedColors(int[] nums){
        int low =0, mid = 0 , high = nums.length -1;
        int temp;

        while (mid<=high){
            if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                mid++;
                low++;

            }else if(nums[mid] == 1){

                mid++;

            }else{

                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;

            }
        }

        return nums;

    }

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0,2,2,1,1};
        System.out.println(Arrays.toString(sortedColors(nums)));
    }
}
