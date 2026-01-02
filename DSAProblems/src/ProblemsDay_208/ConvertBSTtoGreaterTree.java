package ProblemsDay_208;

import ProblemsDay_25.TreeNode;

public class ConvertBSTtoGreaterTree {
//https://leetcode.com/problems/convert-bst-to-greater-tree/?envType=problem-list-v2&envId=depth-first-search
    int sum = 0;
    void find(TreeNode root) {
        if(root==null) return;
        find(root.right);
        sum+=root.val;
        root.val = sum;
        find(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        find(root);
        return root;
    }

    public static void main(String[] args) {

    }
}
