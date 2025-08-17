package ProblemsDay_72;

public class GreatestCommonDivisorStrings {

    //https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);

    }

    private int gcd(int a, int b){
        return b == 0? a : gcd(b, a%b);
    }


    public static void main(String[] args) {

    }
}
