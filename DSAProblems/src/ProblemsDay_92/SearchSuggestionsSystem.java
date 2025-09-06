package ProblemsDay_92;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {

    //https://leetcode.com/problems/search-suggestions-system/?envType=study-plan-v2&envId=leetcode-75

    class TrieNode {

        TrieNode[] links = new TrieNode[26];
        List<String> suggestions = new ArrayList<>();

    }

    TrieNode root = new TrieNode();

    private void insert(String product){
        TrieNode node  = root;

        for(char ch : product.toCharArray()){
            int index = ch - 'a';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
            }

            node = node.links[index];

            if(node.suggestions.size() < 3){
                node.suggestions.add(product);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        for(String product : products){
            insert(product);
        }

        List<List<String>> res = new ArrayList<>();

        TrieNode node = root;

        for(char ch : searchWord.toCharArray()){

            int index = ch -'a';

            if(node != null){
                node = node.links[index];
            }

            if(node != null){
                res.add(node.suggestions);
            }else{
                res.add(new ArrayList<>()); // empty string
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
