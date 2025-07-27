package ProblemsDay_51;

import java.util.ArrayList;
import java.util.List;

public class FindthePeaks {
    //https://leetcode.com/problems/find-the-peaks/description/

    public static List<Integer> findPeaks(int[] nums) {

        List<Integer> res = new ArrayList<>();

        for (int j = 1; j < nums.length - 1; j++) {

            if (nums[j-1] < nums[j] && nums[j] > nums[j + 1] ) {
                res.add(j);

            }


        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,8,5};

        System.out.println(findPeaks(nums));

    }
}
