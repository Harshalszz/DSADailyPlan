package ProblemsDay5;

public class ValidPalindrome {
//https://leetcode.com/problems/valid-palindrome/description/
    public static  boolean isValidPalindrome(String s){
        // s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // int left =0 , right = s.length() -1;

        // while (left<right){
        //     if(s.charAt(left) != s.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }

        // return true;


        int left = 0, right = s.length() - 1;

        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            // Convert uppercase to lowercase
            if (a >= 'A' && a <= 'Z') a = (char)(a + 32);
            if (b >= 'A' && b <= 'Z') b = (char)(b + 32);

            // Skip non-alphanumeric
            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                left++;
                continue;
            }
            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }

            // Compare
            if (a != b) return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isValidPalindrome(s));

    }
}
