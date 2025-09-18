package ProblemsDay_103;

public class RearrangeArrayElementsbySign {

    //https://leetcode.com/problems/rearrange-array-elements-by-sign/

    public int[] rearrangeArray(int[] nums) {

        int[] res = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<nums.length; i++){

            if(nums[i] < 0){
                res[negIndex] = nums[i];
                negIndex += 2;
            }else{
                res[posIndex] = nums[i];
                posIndex +=2;
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
