package ProblemsDay_197;

public class MaskingPersonalInformation {
//https://leetcode.com/problems/masking-personal-information/?envType=problem-list-v2&envId=string
    public String maskPII(String s) {
        if (Character.isLetter(s.charAt(0))) { // Email case
            int idx = s.indexOf('@');
            return ("" + Character.toLowerCase(s.charAt(0)) + "*****"
                    + Character.toLowerCase(s.charAt(idx - 1))
                    + s.substring(idx).toLowerCase());
        }

        // Phone case
        String digits = s.replaceAll("\\D", "");
        int n = digits.length();
        String local = digits.substring(n - 4);
        String maskedLocal = "***-***-" + local;

        if (n == 10) return maskedLocal;

        StringBuilder countryMask = new StringBuilder("+");
        for (int i = 0; i < n - 10; i++) countryMask.append("*");
        return countryMask + "-" + maskedLocal;
    }

    public static void main(String[] args) {

    }
}
