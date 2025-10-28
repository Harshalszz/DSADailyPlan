package ProblemsDay_142;

public class ReverseOnlyLetters {

//https://leetcode.com/problems/reverse-only-letters/?envType=problem-list-v2&envId=two-pointers
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {

    }
}
