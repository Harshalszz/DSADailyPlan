package ProblemsDay_169;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        int ptr1 = 0;

        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[ptr1]){
                nums[++ptr1] = nums[j];
            }
        }

        return ptr1 +1;
    }
    public static void main(String[] args) {

    }
}
