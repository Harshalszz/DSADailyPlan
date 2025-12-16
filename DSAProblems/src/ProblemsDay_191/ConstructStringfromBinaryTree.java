package ProblemsDay_191;

import ProblemsDay_25.TreeNode;

public class ConstructStringfromBinaryTree {
//https://leetcode.com/problems/construct-string-from-binary-tree/?envType=problem-list-v2&envId=string
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        dfs(root, result);

        return result.toString();
    }

    private void dfs(TreeNode node, StringBuilder result) {
        if (node == null) {
            return;
        }

        result.append(node.val);

        if (node.left != null || node.right != null) {
            result.append("(");
            dfs(node.left, result);
            result.append(")");

            if (node.right != null) {
                result.append("(");
                dfs(node.right, result);
                result.append(")");
            }
        }
    }
    public static void main(String[] args) {

    }
}
