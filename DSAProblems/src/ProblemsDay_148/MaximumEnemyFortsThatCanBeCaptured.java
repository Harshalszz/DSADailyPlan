package ProblemsDay_148;

public class MaximumEnemyFortsThatCanBeCaptured {

    //https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/?envType=problem-list-v2&envId=two-pointers
    public int captureForts(int[] forts) {
        int max = 0, last = -1;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (last != -1 && forts[i] != forts[last]) {
                    max = Math.max(max, i - last - 1);
                }
                last = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
