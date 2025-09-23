package ProblemsDay_109;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFormInteger {

    //https://leetcode.com/problems/add-to-array-form-of-integer/

    public List<Integer> addToArrayForm(int[] arr, int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        int i = n - 1;
        int carry = 0;

        while (i >= 0 || k != 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += arr[i--];
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            res.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {

    }
}
