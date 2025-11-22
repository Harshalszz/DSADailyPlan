package ProblemsDay_167;

public class MaximumCountofPositiveIntegerandNegativeInteger2 {

    public int maximumCount(int[] nums) {

        int pos = 0, neg = 0;

        for(int i=0 ; i<nums.length; i++){
            if(nums[i]<0){
                neg++;
            }else if(nums[i] >0){
                pos++;
            }else{
                continue;
            }
        }

        return pos > neg ? pos : neg;
    }
    public static void main(String[] args) {

    }
}
