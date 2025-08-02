package ProblemsDay_57;

import java.util.HashSet;

public class TypeofTriangle {
    //https://leetcode.com/problems/type-of-triangle/

    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        //  Step 1: Check triangle inequality
        if((a + b <= c) || (a + c <= b) || (b + c <= a))
        {
            return "none";
        }

        //  Step 2: Count unique side lengths
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        //  Step 3: Determine triangle type
        return set.size() == 1 ? "equilateral" : (set.size() == 2 ? "isosceles" : "scalene");
    }

    public static void main(String[] args) {

    }
}
