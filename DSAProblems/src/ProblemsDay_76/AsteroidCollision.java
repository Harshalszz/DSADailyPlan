package ProblemsDay_76;

import java.util.Stack;

public class AsteroidCollision {

    //https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop(); // Top asteroid explodes, keep checking
                } else if (stack.peek() == -asteroid) {
                    stack.pop(); // Both explode
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid explodes
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert Stack to int[]
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;


    }

    public static void main(String[] args) {

    }
}
