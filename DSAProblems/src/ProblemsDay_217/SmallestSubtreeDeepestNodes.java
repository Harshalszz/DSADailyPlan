package ProblemsDay_217;

import ProblemsDay_25.TreeNode;

public class SmallestSubtreeDeepestNodes {

    //https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/?envType=problem-list-v2&envId=breadth-first-search
    private static class Pair {
        int depth;
        TreeNode node;

        Pair(int d, TreeNode n) {
            depth = d;
            node = n;
        }
    }

    private Pair dfs(TreeNode root) {
        if (root == null) return new Pair(0, null);

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        if (left.depth == right.depth) {
            return new Pair(left.depth + 1, root);
        } else if (left.depth > right.depth) {
            return new Pair(left.depth + 1, left.node);
        } else {
            return new Pair(right.depth + 1, right.node);
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    public static void main(String[] args) {

    }
}
