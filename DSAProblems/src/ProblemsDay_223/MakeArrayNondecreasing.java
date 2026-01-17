package ProblemsDay_223;

public class MakeArrayNondecreasing {

    //https://leetcode.com/problems/make-array-non-decreasing/?envType=problem-list-v2&envId=monotonic-stack
    public int maximumPossibleSize(int[] nums) {
        int res = 0, pre = 0;
        for (int a: nums) {
            if (pre <= a) {
                pre = a;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
