package ProblemsDay_241;

import java.util.HashSet;
import java.util.Set;

public class CountSubstringsThatDifferOneCharacter {
//https://leetcode.com/problems/count-substrings-that-differ-by-one-character/?envType=problem-list-v2&envId=string
    class Trie{
        Trie[] nodes = new Trie[26];
        int count = 0;
        Set<Integer> child = new HashSet<>();
        void add(String s, int startIndex, int endIndex){
            Trie current = this;
            for (int i = startIndex; i<endIndex; i++){
                if (current.nodes[getInt(s.charAt(i))]==null){
                    // if trie node is not present at ith index, we create a new node
                    // and the index gets added to current child set.
                    // instead of iterating over all 26 nodes, we are iterating over the child set, to enhance performance
                    current.nodes[getInt(s.charAt(i))] = new Trie();
                    current.child.add(getInt(s.charAt(i)));
                }
                current.nodes[getInt(s.charAt(i))].count++;
                current = current.nodes[getInt(s.charAt(i))];
            }
        }
    }
    int find(Trie t, String s, int index, int difference, String carry){
        int ans = 0;
        if (difference==1)
            ans+=t.count;//if current difference is 1 we increment the answer with current node's count
        if (difference==2)
            return ans;
        if (index>s.length()-1) {
            return ans;
        }
        if (t==null)
            return 0;
        //without changing the current element and keeping the given difference
        if (t.nodes[getInt(s.charAt(index))]!=null) {
            ans+=find(t.nodes[getInt(s.charAt(index))], s, index+1, difference, carry+s.charAt(index));
        }
        //changing the current element and incrementing difference by 1
        for (int inx: t.child) {
            if (inx!=getInt(s.charAt(index))) { //only proceed when it is a different element
                ans+=find(t.nodes[inx], s, index+1, difference+1, carry+(char)(inx+'a'));
            }
        }
        return ans;
    }
    int getInt(char c){
        return c-'a';
    }
    public int countSubstrings(String s, String t) {
        Trie trie = new Trie();
        for (int i = 0; i<s.length(); i++){
            trie.add(s, i, s.length()); // generating the Trie
        }
        int ans = 0;
        for (int i = 0; i<t.length(); i++) {
            ans+=find(trie, t, i, 0, ""); // getting the answer for substrings i to n
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
