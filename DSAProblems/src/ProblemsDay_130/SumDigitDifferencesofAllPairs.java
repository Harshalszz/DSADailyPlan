package ProblemsDay_130;

public class SumDigitDifferencesofAllPairs {

//https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs/
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int m = String.valueOf(Math.abs(nums[0])).length();
        long ans = 0;
        while(m > 0){
            int[] count = new int[10];
            for(int i=0; i<n; i++){
                int digit = nums[i]%10;
                nums[i] /= 10;
                count[digit]++;
            }
            for(int c: count){
                ans += (long) c*(n-c);
            }
            m--;
        }
        return ans/2;
    }
    public static void main(String[] args) {

    }
}
