package ProblemsDay_45;

public class DetermineifTwoEventsHaveConflict {

    //https://leetcode.com/problems/determine-if-two-events-have-conflict/description/

    public static boolean haveConflict(String[] e1, String[] e2) {
        return e1[0].compareTo(e2[1]) <= 0 && e2[0].compareTo(e1[1]) <= 0;

    }

    public static void main(String[] args) {
        String[] e1 = {"01:15","02:00"};
        String[] e2 = {"02:00","03:00"};

        System.out.println(haveConflict(e1,e2));
    }
}
