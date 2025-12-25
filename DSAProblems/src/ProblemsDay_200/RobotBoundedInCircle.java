package ProblemsDay_200;

public class RobotBoundedInCircle {
//https://leetcode.com/problems/robot-bounded-in-circle/?envType=problem-list-v2&envId=string
    public boolean isRobotBounded(String instructions) {
        int dir = 0;
        int x = 0, y = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                x += dx[dir];
                y += dy[dir];
            }
            else if (c == 'L') {
                dir = (dir + 3) % 4;  // left turn
            }
            else {  // 'R'
                dir = (dir + 1) % 4;  // right turn
            }
        }

        // Bounded if robot returns OR isn't facing north
        return (x == 0 && y == 0) || dir != 0;
    }

    public static void main(String[] args) {

    }
}
