package ProblemsDay_241;

public class SlowestKey {
//https://leetcode.com/problems/slowest-key/?envType=problem-list-v2&envId=string
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int max = releaseTimes[0];
        for(int i = 1; i< releaseTimes.length  ;i++){

            int diff = Math.abs(releaseTimes[i - 1] -releaseTimes[i]);
            if (diff > max || (diff == max && keysPressed.charAt(i) > ans)) {
                max = diff;
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
