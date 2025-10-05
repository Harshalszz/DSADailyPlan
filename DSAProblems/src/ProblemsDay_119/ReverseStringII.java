package ProblemsDay_119;

public class ReverseStringII {

    //https://leetcode.com/problems/reverse-string-ii/?envType=problem-list-v2&envId=two-pointers

    public void reverse(char[] arr , int i , int j) {
        while(i <= j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }
    }

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = s.length();

        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1 , n - 1);
            reverse(arr , i , j);

            i += 2 * k;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

    }
}
