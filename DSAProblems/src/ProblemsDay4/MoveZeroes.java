package ProblemsDay4;

import java.util.Arrays;

public class MoveZeroes {
    //https://leetcode.com/problems/move-zeroes/
    public static int[] moveZeroes(int[] nums){
        int b= 0;
        int temp;

        for (int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                temp = nums[i];
                nums[i] = nums[b];
                nums[b] = temp;
                b++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1,0,4,0,5,7,0,5};

        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
}
