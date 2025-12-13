package ProblemsDay_188;

public class StudentAttendanceRecordI {

    //https://leetcode.com/problems/student-attendance-record-i/?envType=problem-list-v2&envId=string
    public boolean checkRecord(String s) {
        int countA = 0, countL = 0;

        for (char ch : s.toCharArray()) {
            if (ch != 'L') countL = 0;
            if (ch == 'L') countL++;
            if (ch == 'A') countA++;
            if (countA == 2 || countL == 3) return false;
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
