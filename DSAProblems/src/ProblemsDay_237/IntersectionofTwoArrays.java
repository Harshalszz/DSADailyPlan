package ProblemsDay_237;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

    //https://leetcode.com/problems/intersection-of-two-arrays/
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }

        for(int x :nums2){
            if(set1.contains(x)){
                set2.add(x);
            }
        }

        int [] inter = new int[set2.size()];

        int in=0;
        for(int y : set2){
            inter[in++]=y;
        }

        return inter;
    }
    public static void main(String[] args) {

    }
}
