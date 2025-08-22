package ProblemsDay_77;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    //https://leetcode.com/problems/dota2-senate/?envType=study-plan-v2&envId=leetcode-75

    public String predictPartyVictory(String senate) {
        // not fully slove the problem
        // int countR = 0, countD = 0;
        // char firstSenator = senate.charAt(0);
        // for (char c : senate.toCharArray()) {
        //     if (c == 'R') {
        //         countR++;
        //     } else {
        //         countD++;
        //     }
        // }

        // if (countR == countD) {
        //     return (firstSenator == 'R') ? "Radiant" : "Dire";
        // }

        // return (countR > countD) ? "Radiant" : "Dire";

        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        // Add the indices of R and D to their respective queues
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        // Simulate the banning process
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            if (rIndex < dIndex) {
                // Radiant senator bans Dire and comes back in the next round
                radiant.add(rIndex + n);
            } else {
                // Dire senator bans Radiant and comes back in the next round
                dire.add(dIndex + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";

    }
    public static void main(String[] args) {

    }
}
