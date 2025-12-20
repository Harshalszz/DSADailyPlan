package ProblemsDay_195;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
//https://leetcode.com/problems/letter-case-permutation/?envType=problem-list-v2&envId=string
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack("", s, result);
        return result;
    }

    private void backtrack(String output, String input, List<String> result) {
        if (input.isEmpty()) {
            result.add(output);
            return;
        }
        char c = input.charAt(0);
        String remaining = input.substring(1);
        if (Character.isDigit(c)) {
            backtrack(output + c, remaining, result);
        } else {
            backtrack(output + Character.toLowerCase(c), remaining, result);
            backtrack(output + Character.toUpperCase(c), remaining, result);
        }
    }

    public static void main(String[] args) {

    }
}
