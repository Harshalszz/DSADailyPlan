package ProblemsDay_148;

public class FindArrayConcatenationValue {

    //https://leetcode.com/problems/find-the-array-concatenation-value/?envType=problem-list-v2&envId=two-pointers
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long con = 0;
        String temp="";

        while (l <= r) {
            if (l == r) {
                temp=String.valueOf(nums[l]);
            }
            else{
                temp = String.valueOf(nums[l]) + String.valueOf(nums[r]);
            }

            con += Integer.parseInt(temp);


            l++;
            r--;
        }
        return con;
    }
    public static void main(String[] args) {

    }
}
