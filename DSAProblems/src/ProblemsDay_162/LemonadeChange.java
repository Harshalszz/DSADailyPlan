package ProblemsDay_162;

public class LemonadeChange {

    //https://leetcode.com/problems/lemonade-change/?envType=problem-list-v2&envId=array
    public boolean lemonadeChange(int[] bills) {
        int a = 0, b = 0, n = bills.length;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5)
                a++;
            else if (bills[i] == 10 && a >= 1) {
                b++;
                a--;
            } else if (bills[i] == 20) {
                if (b >= 1 && a >= 1) {
                    b--;
                    a--;
                } else if (a >= 3)
                    a -= 3;
                else
                    return false;
            } else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
