package ProblemsDay_209;

public class KthSymbolinGrammar {

//https://leetcode.com/problems/k-th-symbol-in-grammar/?envType=problem-list-v2&envId=recursion
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }

        if (k % 2 == 0) {
            return kthGrammar(n - 1, k / 2) == 0 ? 1 : 0;
        } else {
            return kthGrammar(n - 1, (k + 1) / 2) == 0 ? 0 : 1;
        }
    }

    public static void main(String[] args) {

    }
}
