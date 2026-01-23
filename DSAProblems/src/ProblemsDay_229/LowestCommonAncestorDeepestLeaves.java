package ProblemsDay_229;

import ProblemsDay_25.TreeNode;

public class LowestCommonAncestorDeepestLeaves {

    //https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/?envType=problem-list-v2&envId=tree
    class Result {
        int depth;
        TreeNode lca;
        Result(int depth, TreeNode lca) {
            this.depth = depth;
            this.lca = lca;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root).lca;
    }

    private Result helper(TreeNode node) {
        if (node == null) return new Result(0, null);

        Result left = helper(node.left);
        Result right = helper(node.right);

        if (left.depth == right.depth) {
            return new Result(left.depth + 1, node);
        } else if (left.depth > right.depth) {
            return new Result(left.depth + 1, left.lca);
        } else {
            return new Result(right.depth + 1, right.lca);
        }
    }
    public static void main(String[] args) {

    }
}
