package ProblemsDay_134;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    //https://leetcode.com/problems/gray-code/?envType=problem-list-v2&envId=math

    public List<Integer> grayCode(int n) {
        int size = 1 << n;  // 2^n
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
