package ProblemsDay_93;

class TrieNode{

    TrieNode[] links = new TrieNode[26];
    boolean isWord = false;
}

class WordDictionary {

    TrieNode root;

    public WordDictionary() {

        root = new TrieNode();

    }

    public void addWord(String word) {

        TrieNode node = root ;

        for(char ch : word.toCharArray()){

            int index = ch-'a';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
            }

            node = node.links[index];
        }

        node.isWord = true;

    }

    public boolean searchInNode(String word, int index , TrieNode node){

        if(index == word.length()){
            return node.isWord;
        }

        char ch = word.charAt(index);

        if(ch == '.'){
            for (TrieNode child : node.links) {
                if (child != null && searchInNode(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        }else{
            int i = ch-'a';

            if(node.links[i] == null){
                return false;
            }

            return searchInNode(word, index + 1, node.links[i]);
        }
    }

    public boolean search(String word) {

        // will use dfs to find

        return searchInNode(word, 0, root);

    }
}

public class DesignAddandSearchWordsDataStructure {

    //https://leetcode.com/problems/design-add-and-search-words-data-structure/?envType=problem-list-v2&envId=trie
    public static void main(String[] args) {

    }
}
