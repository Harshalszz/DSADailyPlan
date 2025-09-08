package ProblemsDay_94;

public class LongestWordDictionary {
    //https://leetcode.com/problems/longest-word-in-dictionary/?envType=problem-list-v2&envId=trie

    class TrieNode{

        TrieNode[] links = new TrieNode[26];
        boolean isWord;
    }

    TrieNode root = new TrieNode();

    public void insert(String word){

        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch-'a';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
            }

            node = node.links[index];
        }

        node.isWord = true;
    }

    public boolean isValid(String word){

        TrieNode node = root;

        for(char ch : word.toCharArray()){

            int index = ch - 'a';

            node = node.links[index];

            if(node == null || !node.isWord){
                return false;
            }
        }

        return true;
    }

    public String longestWord(String[] words) {

        for(String w : words){
            insert(w);
        }

        String res = "";

        for(String word : words){

            if(isValid(word)){

                if (word.length() > res.length() ||
                        (word.length() == res.length() && word.compareTo(res) < 0)) {
                    res = word;
                }

            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
