package ProblemsDay5;

public class FirstMissingPositive {
//https://leetcode.com/problems/first-missing-positive
    public static int firstMissingPositive(int[] nums){
        int N = nums.length;
        boolean one = false;

        for(int i=0; i<N; i++){
            if(nums[i] == 1){
                one = true;
            }

            if(nums[i] <1 || nums[i] >N){
                nums[i] = 1;
            }
        }
        if(one == false){ return 1;}

        for(int i = 0; i<N;i++){
            int index = Math.abs(nums[i]);

            nums[index-1] = -Math.abs(nums[index-1]);
        }

        for (int i=0;i<N;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return N+1;
    }

    public static void main(String[] args) {

        int[] nums = {-2,-1,0,1,3,4,7};
        System.out.println(firstMissingPositive(nums));

    }
}
