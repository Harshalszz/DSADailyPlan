package ProblemsDay_247;

public class GenerateStringWithCharactersThatHaveOddCounts {

    //https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/?envType=problem-list-v2&envId=string
    public String generateTheString(int n) {
        if (n % 2 == 1) {
            return "a".repeat(n);
        } else {
            return "a".repeat(n - 1) + "b";
        }
    }
    public static void main(String[] args) {

    }
}
