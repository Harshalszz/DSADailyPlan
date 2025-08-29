package ProblemsDay_84;

public class StoneGame {
    //https://leetcode.com/problems/stone-game/
    public boolean stoneGame(int[] piles) {
        //alice will always wins
        return true;

        // int aliceTotal = 0;
        // int bobTotal = 0;

        // boolean flag = true;

        // int i=0, j = piles.length - 1;

        // while(i<=j){
        //     if(flag){
        //         if(piles[i] > piles[j]){
        //             aliceTotal += piles[i];
        //             i++;
        //         }else{
        //             aliceTotal += piles[j];
        //             j--;
        //         }
        //         flag = !flag;
        //     }else{
        //         if(piles[i] > piles[j]){
        //             bobTotal += piles[i];
        //             i++;
        //         }else{
        //             bobTotal += piles[j];
        //             j--;
        //         }
        //         flag = !flag;
        //     }
        // }

        // return aliceTotal>bobTotal;

    }

    public static void main(String[] args) {

    }
}
