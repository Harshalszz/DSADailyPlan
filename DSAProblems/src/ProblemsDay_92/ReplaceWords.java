package ProblemsDay_92;

import java.util.List;

public class ReplaceWords {
    //https://leetcode.com/problems/replace-words/


    class TrieNode{
        TrieNode[] links = new TrieNode[26];
        boolean isWord = false;
    }

    TrieNode root;

    private void insert(String word){

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

    private String search(String inWord){
        TrieNode node = root;
        int j = 0;

        for(char ch : inWord.toCharArray()){

            int index = ch - 'a';
            j++;
            if(node.links[index]  == null){
                return inWord;
            }else if(node.links[index].isWord){
                return inWord.substring(0, j);
            }else{
                node = node.links[index];
            }
        }

        return inWord;
    }

    public String replaceWords(List<String> dictionary, String sentence) {

        root = new TrieNode();

        for(String word : dictionary){
            insert(word);
        }

        StringBuilder res = new StringBuilder();

        String[] input = sentence.split(" "); // stroing word of stenmce in input array

        for(String inWord : input){
            res.append(search(inWord));
            res.append(" ");
        }

        return res.toString().trim();

    }

    public static void main(String[] args) {

    }
}
