package ProblemsDay_78;

public class TransformArraybyParity {
    //https://leetcode.com/problems/transform-array-by-parity/

    public int[] transformArray(int[] nums) {

        int[] ans = new int[nums.length];

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]%2 == 0){
        //         ans[i] = 0;
        //     }else{
        //         ans[i]=1;
        //     }
        // }

        // Arrays.sort(ans);

        int index = 0;
        for(int n: nums){
            if(n%2 == 0){
                ans[index] = 0;
                index++;
            }
        }

        while(index < nums.length){
            ans[index]=1;
            index++;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
