package ProblemsDay_141;

public class LicenseKeyFormatting {

    //https://leetcode.com/problems/license-key-formatting/?envType=problem-list-v2&envId=string
    public String licenseKeyFormatting(String s, int k) {
        // Step 1: Remove dashes and convert the string to uppercase
        String temp = s.replaceAll("-", "").toUpperCase();

        // Step 2: Insert dashes after every 'k' characters starting from the right
        StringBuilder result = new StringBuilder();
        int count = 0;

        // Traverse the string in reverse order
        for (int i = temp.length() - 1; i >= 0; i--) {
            if (count == k) {
                result.append("-");
                count = 0;
            }
            result.append(temp.charAt(i));
            count++;
        }

        // Step 3: Reverse the result string to get the final answer
        return result.reverse().toString();
    }
    public static void main(String[] args) {

    }
}
