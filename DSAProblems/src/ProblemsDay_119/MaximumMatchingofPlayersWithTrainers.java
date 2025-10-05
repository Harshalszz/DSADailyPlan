package ProblemsDay_119;

import java.util.Arrays;

public class MaximumMatchingofPlayersWithTrainers {
    //https://leetcode.com/problems/maximum-matching-of-players-with-trainers/

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int res = 0;
        int i=0, j=0;

        while(i<players.length && j < trainers.length){

            if(players[i] <= trainers[j]){
                res++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
