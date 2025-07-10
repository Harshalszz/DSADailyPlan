package ProblemsDay_34;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
//https://leetcode.com/problems/binary-tree-postorder-traversal/
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> resList = new ArrayList<>();

        postorder(root,resList);

        return resList;

    }

    public static void postorder(TreeNode node, List<Integer> resList){

        if(node == null){
            return ;
        }

        postorder(node.left,resList);
        postorder(node.right, resList);
        resList.add(node.val);

    }

    public static void main(String[] args) {

    }
}
