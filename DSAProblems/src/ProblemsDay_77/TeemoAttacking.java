package ProblemsDay_77;

public class TeemoAttacking {
    //https://leetcode.com/problems/teemo-attacking/

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;

        for(int i = 1; i < timeSeries.length; i++){
            int timeDiff = timeSeries[i] - timeSeries[i - 1];

            if(timeDiff < duration){
                time += timeDiff;
            }else{
                time += duration;
            }
        }

        return time + duration;
    }

    public static void main(String[] args) {

    }
}
