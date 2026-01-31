package ProblemsDay_237;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int indx = 0;

        for(int n:nums){
            if(n !=0){
                nums[indx] = n;
                indx++;
            }
        }

        while(indx <nums.length){
            nums[indx] = 0;
            indx++;
        }

    }
    public static void main(String[] args) {

    }
}
