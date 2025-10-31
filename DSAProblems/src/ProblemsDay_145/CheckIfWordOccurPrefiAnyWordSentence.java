package ProblemsDay_145;

public class CheckIfWordOccurPrefiAnyWordSentence {

    //https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/?envType=problem-list-v2&envId=two-pointers

    public int isPrefixOfWord(String sentence, String k) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(k)) return i + 1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
