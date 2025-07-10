package ProblemsDay_34;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class NaryTreePostorderTraversal {
    //https://leetcode.com/problems/n-ary-tree-postorder-traversal/
    public List<Integer> postorder(Node root) {

        List<Integer> resList = new ArrayList<>();

        if(root == null){
            return resList;
        }

        dfs(root,resList);

        return resList;
    }


    public static void dfs(Node node, List<Integer> resList){

        for(Node child : node.children){
            dfs(child,resList);
        }

        resList.add(node.val);
    }
    public static void main(String[] args) {

    }
}
