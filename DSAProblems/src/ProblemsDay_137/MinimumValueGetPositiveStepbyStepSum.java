package ProblemsDay_137;

public class MinimumValueGetPositiveStepbyStepSum {

//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/?envType=problem-list-v2&envId=prefix-sum
    public int minStartValue(int[] nums) {
        int len=nums.length;
        int[] preFix=new int[len];
        int minStartValue=1; // Firstly let us start with the minimum positive startValue possible which is '1'.

        for(int i=0;i<len;i++){
            if(i==0){
                preFix[i]=minStartValue+nums[i];
            }
            else{
                preFix[i]=preFix[i-1]+nums[i];
            }

            // If the step-by-step sum at current index is less than '1', then we will try to find the 'number to be added' to make the sum '1'.

            // Why not make the sum '2' or '3' or any bigger number?
            // Because, we need to find the minimum positive startValue. For that reason, we try to make the sum '1' by adding the least number possible and add the same number to the startValue.
            if(preFix[i]<1){
                int toBeIncreased=1-preFix[i];
                preFix[i]+=toBeIncreased;
                minStartValue+=toBeIncreased;
            }
        }

        return minStartValue;
    }
    public static void main(String[] args) {

    }
}
