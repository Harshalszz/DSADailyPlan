package ProblemsDay_86;

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {

    //https://leetcode.com/problems/successful-pairs-of-spells-and-potions/?envType=study-plan-v2&envId=leetcode-75

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = spells.length;
        int res[] = new int[m];
        int n = potions.length;
        for(int i = 0; i<m;i++){
            int start = 0 , end = n -1 ;
            int ans = 0;
            while(start <= end){
                int mid = start + (end - start) / 2;
                long prod = (long)potions[mid]*spells[i];
                if(prod >= success){
                    // value is greater but also check in left part
                    ans = n - mid;
                    end = mid - 1;
                }else{
                    // no ans found check in right part
                    start = mid +1;
                }

            }
            res[i] = ans;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
