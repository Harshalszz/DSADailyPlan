package ProblemsDay_169;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int ptr = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] !=0){

                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;

                ptr++;
            }
        }


    }
    public static void main(String[] args) {

    }
}
