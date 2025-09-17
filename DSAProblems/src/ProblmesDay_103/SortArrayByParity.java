package ProblmesDay_103;

public class SortArrayByParity {

    //https://leetcode.com/problems/sort-array-by-parity/

    public int[] sortArrayByParity(int[] nums) {

        // int[] res = new int[nums.length];

        // int index = 0, pointer = 0;

        // while(pointer < nums.length){

        //     if(nums[pointer] % 2 == 0){
        //         res[index] = nums[pointer];
        //         index++;
        //     }
        //     pointer++;
        // }
        // pointer = 0;
        // while(pointer < nums.length){

        //     if(nums[pointer] % 2 != 0){
        //         res[index] = nums[pointer];
        //         index++;
        //     }

        //     pointer++;
        // }

        // return res;

        int pos = 0;
        int i = nums.length-1;
        while(pos<i){
            if(nums[i]%2==0){
                if(nums[pos]%2==0) pos++;
                else{
                    int swap = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = swap;
                    pos++;
                    i--;
                }
            }else{
                i--;
            }

        }


        return nums;


    }

    public static void main(String[] args) {

    }
}
