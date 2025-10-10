package ProblemsDay_125;

public class ReverseWordsStringIII {
//https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=problem-list-v2&envId=two-pointers

    public String reverseWords(String s) {

        String[] strArr = s.split(" ");

        for(int i=0; i< strArr.length; i++){
            strArr[i] = reverse(strArr[i]);
        }
        String result = String.join(" ", strArr);

        return result;
    }

    public String reverse(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;

        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {

    }
}
