package ProblemsDay_181;

public class FindStudentthatWillReplacetheChalk {

//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/?envType=problem-list-v2&envId=binary-search
    public int chalkReplacer(int[] chalk, int k) {
        // 1. Find sum of elements in chalk
        long total = 0;

        for(int i = 0; i < chalk.length; i++) {
            total += chalk[i];
        }

        // 2. Calculate k %= total
        k %= total;

        // 3. Loop across chalk again and decrement until all the chalk runs out
        for(int i = 0; i < chalk.length; i++) {
            if(k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return 0;

    }

    public static void main(String[] args) {

    }
}
