package ProblermsDay_216;

import ProblemsDay_25.TreeNode;

public class BinaryTreePruning {

    //https://leetcode.com/problems/binary-tree-pruning/?envType=problem-list-v2&envId=binary-tree
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        root.left= pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val==0 && root.left==null && root.right==null){
            return null;
        }
        return root;

    }
    public static void main(String[] args) {

    }
}
