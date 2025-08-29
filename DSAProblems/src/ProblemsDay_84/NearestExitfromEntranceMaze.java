package ProblemsDay_84;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearestExitfromEntranceMaze {
    //https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/?envType=study-plan-v2&envId=leetcode-75
    //using BFS

    public int nearestExit(char[][] maze, int[] entrance) {

        int m = maze.length;
        int n = maze[0].length;

        int[] directionX = {1,-1,0,0};
        int[] directionY = {0,0,-1,1};

        Deque<int[]> queue = new ArrayDeque<>();

        queue.add(new int[] {entrance[0], entrance[1]});
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.pollFirst();
                int currR = curr[0];
                int currC = curr[1];

                for (int d = 0; d < 4; d++) {
                    int x = currR + directionX[d];
                    int y = currC + directionY[d];

                    // Skip out-of-bounds
                    if (x < 0 || y < 0 || x >= m || y >= n) continue;

                    // Skip walls or visited
                    if (maze[x][y] == '+') continue;

                    // Check if it's an exit (but not the entrance)
                    if (x == 0 || y == 0 || x == m - 1 || y == n - 1) {
                        return steps + 1; // found the exit
                    }

                    // Mark as visited and add to queue
                    maze[x][y] = '+';
                    queue.add(new int[] {x, y});
                }
            }
            steps++; // increase steps after processing each level
        }

        return -1;

    }

    public static void main(String[] args) {

    }
}
