package ProblemsDay_161;

import java.util.HashSet;

public class DistributeCandies {

    //https://leetcode.com/problems/distribute-candies/?envType=problem-list-v2&envId=array
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int caneat = n/2;

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }

        return Math.min(hs.size(),caneat);
    }
    public static void main(String[] args) {

    }
}
