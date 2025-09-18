package ProblemsDay_103;

public class SortArrayByParityII {

    //https://leetcode.com/problems/sort-array-by-parity-ii/

    public int[] sortArrayByParityII(int[] nums) {

        int[] res = new int[nums.length];

        int even = 0;
        int odd = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                res[even] = nums[i];
                even += 2;
            }else{
                res[odd] = nums[i];
                odd += 2;
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
