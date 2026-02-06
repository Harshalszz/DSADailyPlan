package ProblemsDay_243;

public class PreviousPermutationWithOneSwap {

    //https://leetcode.com/problems/previous-permutation-with-one-swap/?envType=problem-list-v2&envId=array
    static int[] stack = new int[(int) 1e4];
    static int r;

    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int index = -1;
        r = 0;
        for (int i = n-1; i >= 0; i--) {
            while (r > 0 && arr[stack[r-1]] <= arr[i]){
                if(arr[stack[r-1]] == arr[i]){
                    r--;
                    continue;
                }
                index = stack[--r];
            }
            if(index != -1){
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
                return arr;
            }
            stack[r++] = i;
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
