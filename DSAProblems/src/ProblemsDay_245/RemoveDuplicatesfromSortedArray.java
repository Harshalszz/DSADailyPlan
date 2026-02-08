package ProblemsDay_245;

public class RemoveDuplicatesfromSortedArray {
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {

        int index = 0;

        for(int i=1; i<nums.length; i++){

            if(nums[i] != nums[index]){
                index++; //then increment thr index , so the two elements remain in same position
                nums[index] = nums[i];
            }
        }

        return index +1 ;

    }
    public static void main(String[] args) {

    }
}
