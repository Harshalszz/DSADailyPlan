package ProblemsDay_169;

import java.util.Arrays;

public class DividePlayersIntoTeamsEqualSkill {

    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        long totalSum = 0;

        for (int num : skill) totalSum += num;

        int noOfTeams = n / 2;
        if (totalSum % noOfTeams != 0) return -1;

        int req = (int)(totalSum / noOfTeams);
        long sum = 0;

        int i = 0;
        int j = n - 1;
        while(i <= j) {
            if (skill[i] + skill[j] != req) return -1;
            sum += skill[i] * skill[j];
            i++;
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
