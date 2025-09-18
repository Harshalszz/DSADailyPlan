package ProblemsDay_103;

public class PartitionArrayAccordingGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {

        // List<Integer> small = new ArrayList<>();
        // List<Integer> equal = new ArrayList<>();
        // List<Integer> large = new ArrayList<>();
        // int i =0 ;

        // while(i<nums.length){

        //     if(nums[i] < pivot){
        //         small.add(nums[i]);
        //     }else if(nums[i] == pivot){
        //         equal.add(nums[i]);
        //     }
        //     else{
        //         large.add(nums[i]);
        //     }

        //     i++;
        // }

        // int[] res = new int[nums.length];

        // int j=0;

        // for(int num : small){
        //     res[j++] = num;
        // }

        // for(int num : equal){
        //     res[j++] = num;
        // }

        // for(int num : large){
        //     res[j++] = num;
        // }

        // return res;

        int n = nums.length;
        int[] res = new int[n];

        // First pass: count how many < pivot
        int lessCount = 0;
        int equalCount = 0;
        for (int num : nums) {
            if (num < pivot) lessCount++;
            else if (num == pivot) equalCount++;
        }

        // Pointers for placement
        int i = 0;
        int j = lessCount;
        int k = lessCount + equalCount;

        // Second pass: place numbers in the correct section
        for (int num : nums) {
            if (num < pivot) {
                res[i++] = num;
            } else if (num == pivot) {
                res[j++] = num;
            } else {
                res[k++] = num;
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
