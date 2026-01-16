package ProblemsDay_222;

import ProblemsDay_25.TreeNode;

public class ConstructBinarySearchTreefromPreorder {

    //https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/?envType=problem-list-v2&envId=array
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    private TreeNode build(int[] preorder, int bound, int[] idx) {
        if (idx[0] == preorder.length || preorder[idx[0]] > bound) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[idx[0]++]);

        root.left = build(preorder, root.val, idx);
        root.right = build(preorder, bound, idx);

        return root;
    }
    public static void main(String[] args) {

    }
}
