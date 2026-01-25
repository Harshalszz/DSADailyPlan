package ProblemsDay_231;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefiDivisibleBy5 {
//https://leetcode.com/problems/binary-prefix-divisible-by-5/?envType=problem-list-v2&envId=array
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
