package ProblemsDay_47;

public class MaximumValueOrderedTriplet {
    //https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
    public long maximumTripletValue(int[] nums) {

        long maxTriplet = 0, maxElement = 0, maxDiff = 0;
        for (int num : nums) {
            maxTriplet = Math.max(maxTriplet, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxElement - num);
            maxElement = Math.max(maxElement, num);
        }
        return maxTriplet;

    }
    public static void main(String[] args) {

    }
}
