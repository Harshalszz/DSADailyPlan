package ProblemsDay_27;

public class KokoEatingBananas {
    //https://leetcode.com/problems/koko-eating-bananas/description/
    public static int maxele(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++)
            max = Math.max(max, piles[i]);
        return max;
    }

    public static int totaltime(int[] piles, int mid) {
        int total = 0;
        for (int i = 0; i < piles.length; i++)
            total += Math.ceil((double)piles[i] / mid);
        return total;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxele(piles), totalhour = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            totalhour = totaltime(piles, mid);
            if (totalhour <= h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {

        int[] piles ={3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));

    }
}
