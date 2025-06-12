package ProblemsDay6;

import java.util.Arrays;

public class SingleNumberIII {
//https://leetcode.com/problems/single-number-iii/description/
    public static int[] singleTwoNumbers(int[] nums){
        int n = nums.length;
        int xor = 0;
        for (int i=0; i<n;i++){
            xor ^=nums[i];
        }

        //int rightmostbit = (xor&(xor-1))&xor;
        int rightmostBit = xor & -xor; // isolates the rightmost set bit
        int b1=0,b2=0;

        for(int i=0;i<n;i++){

            if((nums[i] & rightmostBit) != 0 ){
                b1 ^=nums[i];
            }else{
                b2 ^= nums[i];
            }

        }

        return new int[]{b1,b2};

    }

    public static void main(String[] args) {
        int[] nums ={1,2,1,3,2,5};

        System.out.println(Arrays.toString(singleTwoNumbers(nums)));

    }
}
