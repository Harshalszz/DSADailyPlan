package ProblemsDay_62;

public class NumberEmployeesWhoMettheTarget {
    //https://leetcode.com/problems/number-of-employees-who-met-the-target/

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int ans = 0 ;

        for(int hr: hours){

            if(hr>=target){
                ans++;
            }
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
