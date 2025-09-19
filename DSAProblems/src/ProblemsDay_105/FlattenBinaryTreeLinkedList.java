package ProblemsDay_105;

import ProblemsDay_25.TreeNode;

public class FlattenBinaryTreeLinkedList {
    //https://leetcode.com/problems/flatten-binary-tree-to-linked-list/?envType=study-plan-v2&envId=top-interview-150
    public TreeNode prev = null;
    public void flatten(TreeNode root) {

        if(root == null){
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;


    }

    public static void main(String[] args) {

    }
}
