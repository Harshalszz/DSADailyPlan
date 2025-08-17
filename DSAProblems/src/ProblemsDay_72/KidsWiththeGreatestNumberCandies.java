package ProblemsDay_72;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberCandies {

    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();
        int maxCandi = Integer.MIN_VALUE;

        for(int c: candies){
            maxCandi = Math.max(maxCandi,c);
        }

        for(int can : candies){
            if(can + extraCandies >= maxCandi){
                res.add(true);
            }else{
                res.add(false);
            }
        }

        return res;


    }

    public static void main(String[] args) {

    }
}
