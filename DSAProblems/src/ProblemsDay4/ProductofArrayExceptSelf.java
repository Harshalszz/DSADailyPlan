package ProblemsDay4;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
//https://leetcode.com/problems/product-of-array-except-self/description/
    public static int[] productofArrayExceptSelf(int[] nums){
        int N = nums.length;
        int[] result = new int[N];

        int[] leftProduct = new int[N];

        int[] rightProduct = new int[N];

        leftProduct[0] = 1;
        rightProduct[N-1] = 1;


        for(int i=1; i<N; i++){
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }

        for(int i = N-2; i>=0; i--){
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }

        for(int i=0;i<N;i++){
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums ={-1,1,0,-3,3};

        System.out.println(Arrays.toString(productofArrayExceptSelf(nums)));

    }
}
