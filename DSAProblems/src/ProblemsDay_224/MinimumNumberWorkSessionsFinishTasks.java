package ProblemsDay_224;

public class MinimumNumberWorkSessionsFinishTasks {

    //https://leetcode.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/?envType=problem-list-v2&envId=backtracking
    private int minSessions;

    public int minSessions(int[] tasks, int sessionTime) {
        minSessions = tasks.length; // Worst case: one session per task
        int[] sessions = new int[tasks.length];

        // Sort tasks in descending order
        //Arrays.sort(tasks);
        //reverse(tasks);

        backtrack(0, tasks, sessions, 0, sessionTime);
        return minSessions;
    }

    private void backtrack(int index, int[] tasks, int[] sessions, int usedSessions, int sessionTime) {
        if (usedSessions >= minSessions) {
            return; // Early termination
        }

        if (index == tasks.length) {
            minSessions = Math.min(minSessions, usedSessions);
            return;
        }

        for (int i = 0; i < sessions.length; i++) {
            if (i > 0 && sessions[i] == sessions[i-1]) continue; // Skip duplicate assignments

            if (sessions[i] + tasks[index] <= sessionTime) {
                sessions[i] += tasks[index];
                backtrack(index + 1, tasks, sessions, Math.max(usedSessions, i + 1), sessionTime);
                sessions[i] -= tasks[index];
            }

            if (sessions[i] == 0) break; // Optimization: no need to try empty sessions
        }
    }

    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {

    }
}
