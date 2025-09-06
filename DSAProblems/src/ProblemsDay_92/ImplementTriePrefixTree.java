package ProblemsDay_92;

public class ImplementTriePrefixTree {
    //https://leetcode.com/problems/implement-trie-prefix-tree/?envType=study-plan-v2&envId=leetcode-75

    class TrieNode {
        TrieNode[] links;
        boolean isWord;

        TrieNode(){
            links = new TrieNode[26];
            isWord = false;
        }
    }

    class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();

        }

        public void insert(String word) {

            TrieNode node = root;

            for(char ch : word.toCharArray()){
                int index = ch - 'a';

                if(node.links[index] == null){
                    node.links[index] = new TrieNode();
                }

                node = node.links[index];
            }

            node.isWord = true;

        }

        public boolean search(String word) {

            TrieNode node = root;

            for(char ch : word.toCharArray()){
                int index = ch - 'a';

                if(node.links[index] == null){
                    return false;
                }

                node = node.links[index];
            }

            return node.isWord;

        }

        public boolean startsWith(String prefix) {

            TrieNode node = root;

            for(char ch : prefix.toCharArray()){
                int index = ch - 'a';

                if(node.links[index] == null){
                    return false;
                }

                node = node.links[index];
            }

            return true;

        }
    }

    public static void main(String[] args) {

    }
}
