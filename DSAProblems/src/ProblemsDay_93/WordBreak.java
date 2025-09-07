package ProblemsDay_93;

import java.util.List;

public class WordBreak {
    //https://leetcode.com/problems/word-break/?envType=problem-list-v2&envId=trie

    class TrieNode {

        TrieNode[] links = new TrieNode[26];
        boolean isWord = false;
    }

    TrieNode root = new TrieNode();

    public void insert(String word){

        TrieNode node= root;

        for(char ch : word.toCharArray()){

            int index = ch-'a';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
            }

            node = node.links[index];
        }

        node.isWord = true;
    }

    // DFS with memoization
    public boolean dfs(String s, int start, Boolean[] memo){
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];

        TrieNode node = root;

        for (int i = start; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (node.links[index] == null) {
                break; // no path in Trie
            }
            node = node.links[index];
            if (node.isWord) {
                if (dfs(s, i + 1, memo)) {
                    return memo[start] = true;
                }
            }
        }

        return memo[start] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for(String str : wordDict){
            insert(str);
        }

        Boolean[] memo = new Boolean[s.length()];
        return dfs(s, 0, memo);


    }

    public static void main(String[] args) {

    }
}
