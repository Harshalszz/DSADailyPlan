package ProblemsDay_110;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    //https://leetcode.com/problems/word-search-ii/?envType=study-plan-v2&envId=top-interview-150

    class TrieNode {
        char c;
        int ends;
        String word;
        TrieNode[] children = new TrieNode[26];

        public TrieNode(char c) {
            this.c = c;
            this.ends = 0;
            this.word = "";
        }
    }

    TrieNode root = getNode('/');

    private TrieNode getNode(char c) {
        return new TrieNode(c);
    }

    // Insert word into trie
    private void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = getNode(ch);
            }
            curr = curr.children[index];
        }
        curr.ends += 1;
        curr.word = word;
    }

    private void solve(char[][] board, int i, int j, int r, int c, List<String> ans, TrieNode curr) {
        char ch = board[i][j];
        if (ch == '$' || curr.children[ch - 'a'] == null) {
            return;
        }

        curr = curr.children[ch - 'a'];

        if (curr.ends > 0) {
            ans.add(curr.word);
            curr.ends -= 1;  // prevent duplicates
        }

        board[i][j] = '$';  // mark as visited

        if (i > 0) solve(board, i - 1, j, r, c, ans, curr);     // up
        if (i < r - 1) solve(board, i + 1, j, r, c, ans, curr); // down
        if (j > 0) solve(board, i, j - 1, r, c, ans, curr);     // left
        if (j < c - 1) solve(board, i, j + 1, r, c, ans, curr); // right

        board[i][j] = ch;  // unmark
    }

    public List<String> findWords(char[][] board, String[] words) {
        int r = board.length;
        int c = board[0].length;

        // Insert all words into trie
        for (String word : words) {
            insert(word);
        }

        List<String> ans = new ArrayList<>();

        // Start DFS from each cell
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                solve(board, i, j, r, c, ans, root);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
