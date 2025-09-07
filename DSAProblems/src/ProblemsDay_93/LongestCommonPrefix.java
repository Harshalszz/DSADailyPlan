package ProblemsDay_93;

public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix/?envType=problem-list-v2&envId=trie

    class TrieNode {

        TrieNode[] links = new TrieNode[26];
        boolean isWord = false;
        int childCount = 0;
    }

    TrieNode root = new TrieNode();

    public void insert(String word){

        TrieNode node = root;

        for(char ch : word.toCharArray()){

            int index = ch-'a';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
                node.childCount++;
            }

            node = node.links[index];
        }

        node.isWord = true;
    }

    public String search(String word){

        TrieNode node = root;
        StringBuilder res = new StringBuilder();

        for(char ch : word.toCharArray()){

            int index = ch-'a';

            if(node.childCount != 1 || node.isWord){
                break;
            }

            res.append(ch);
            node = node.links[index];
        }

        return res.toString();
    }

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        for(String str : strs){
            insert(str);
        }

        //we will check the LCP from first word

        return search(strs[0]);

    }

    public static void main(String[] args) {

    }
}
