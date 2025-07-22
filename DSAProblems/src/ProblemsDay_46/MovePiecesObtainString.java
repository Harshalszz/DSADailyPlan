package ProblemsDay_46;

public class MovePiecesObtainString {
    //https://leetcode.com/problems/move-pieces-to-obtain-a-string/description/

    public static boolean canChange(String start, String target) {

        int i = 0, j = 0, n = start.length();

        while (i < n || j < n) {
            while (i < n && start.charAt(i) == '_')
                i++;
            while (j < n && target.charAt(j) == '_')
                j++;

            if (i == n || j == n)
                break;
            if (start.charAt(i) != target.charAt(j))
                return false;
            if (start.charAt(i) == 'L' && i < j)
                return false;
            if (start.charAt(i) == 'R' && i > j)
                return false;

            i++;
            j++;
        }

        return i == n && j == n;

    }

    public static void main(String[] args) {

        String start = "_L__R__R_";
        String target = "L______RR";

        System.out.println(canChange(start,target));

    }
}
