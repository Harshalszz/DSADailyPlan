package ProblemsDay_201;

import java.util.Arrays;
import java.util.Random;

public class ShuffleanArray {
//https://leetcode.com/problems/shuffle-an-array/?envType=problem-list-v2&envId=array
    private int[] arr;
    private Random random;
    public ShuffleanArray(int[] nums) {
        this.arr=nums;
        random = new Random();
    }

    public int[] reset() {
        return this.arr;
    }

    public int[] shuffle() {
        int shuffled[] = Arrays.copyOfRange(arr, 0, arr.length);
        for(int i= arr.length - 1;i>=0;--i){
            int j=random.nextInt(i+1);
            int temp=shuffled[i];
            shuffled[i]=shuffled[j];
            shuffled[j]=temp;
        }
        return shuffled;
    }

    public static void main(String[] args) {

    }
}
