package ProblermsDay_216;

import ProblemsDay_25.TreeNode;

public class FlipEquivalentBinaryTrees {

//https://leetcode.com/problems/flip-equivalent-binary-trees/?envType=problem-list-v2&envId=binary-tree
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        return checker(root1, root2);
    }

    private boolean checker(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;

        boolean noFlip =
                checker(node1.left, node2.left) &&
                        checker(node1.right, node2.right);

        boolean flip =
                checker(node1.left, node2.right) &&
                        checker(node1.right, node2.left);

        return noFlip || flip;
    }

    public static void main(String[] args) {

    }
}
