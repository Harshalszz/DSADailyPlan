package ProblemsDay_94;

public class FindLengthLongestCommonPrefix {

    //https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/?envType=problem-list-v2&envId=trie

    class TrieNode{

        TrieNode[] links = new TrieNode[10];
    }

    TrieNode root = new TrieNode();

    public void insert(String str){

        TrieNode node = root;

        for(char ch : str.toCharArray()){

            int index = ch - '0';

            if(node.links[index] == null){
                node.links[index] = new TrieNode();
            }
            node = node.links[index];
        }
    }

    public int helper(String str){
        int count = 0;
        TrieNode node = root;

        for(char ch : str.toCharArray()){

            int index = ch-'0';

            if(node.links[index] == null){
                break;
            }
            node = node.links[index];
            count++;
        }
        return count;
    }


    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        for(int num : arr1){
            String str = Integer.toString(num);
            insert(str);
        }

        int res = 0;

        for(int num : arr2){
            String str = Integer.toString(num);

            int len = helper(str);

            res = Math.max(res,len);
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
