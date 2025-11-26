package ProblemsDay_171;

public class NumberSubarrayswithBoundedMaximum {

    //https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/?envType=problem-list-v2&envId=two-pointers

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int high = 0;
        int ans = 0;
        int low = 0;
        for(int n : nums){
            if(n > right) high = 0;
            else ans += ++high;
            if(n >= left) low = 0;
            else ans -= ++low;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
