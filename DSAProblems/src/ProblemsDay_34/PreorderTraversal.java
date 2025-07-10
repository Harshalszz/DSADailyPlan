package ProblemsDay_34;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
//https://leetcode.com/problems/binary-tree-preorder-traversal/
    public static void preorder(TreeNode node, List<Integer> resList){

        if(node == null){
            return;
        }

        resList.add(node.val);
        preorder(node.left, resList);
        preorder(node.right, resList);
    }

    public static void main(String[] args) {

        List<Integer> resList = new ArrayList<>();

       // preorder(root, resList);

        //return resList;

    }
}
