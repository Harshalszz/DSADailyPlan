package ProblemsDay_60;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    //https://leetcode.com/problems/lexicographical-numbers/


    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    private void dfs(int current, int max, List<Integer> result) {
        if (current > max) return;
        result.add(current);
        for (int i = 0; i < 10; i++) {
            int next = current * 10 + i;
            if (next > max) return;
            dfs(next, max, result);
        }
    }

    public static void main(String[] args) {

    }
}
