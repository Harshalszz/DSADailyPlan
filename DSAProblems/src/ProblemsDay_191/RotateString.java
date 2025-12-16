package ProblemsDay_191;

public class RotateString {
//https://leetcode.com/problems/rotate-string/?envType=problem-list-v2&envId=string
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
    public static void main(String[] args) {

    }
}
