package ProblemsDay_214;

public class MaximumPointsYouCanObtainCards {

    //https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/?envType=problem-list-v2&envId=sliding-window
    public int maxScore(int[] cardPoints, int k) {
        int res1 = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            res1 += cardPoints[i];
        }

        max = res1;

        int l = k-1;
        int r = cardPoints.length - 1;

        while(k != 0){
            res1 = res1 - cardPoints[l];
            res1 += cardPoints[r];
            max = Math.max(max, res1);
            k--;
            r--;
            l--;
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
