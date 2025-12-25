package ProblemsDay_200;

import ProblemsDay_25.TreeNode;

public class SmallestStringStartingFromLeaf {
//https://leetcode.com/problems/smallest-string-starting-from-leaf/?envType=problem-list-v2&envId=string
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder smallest = new StringBuilder();
        dfs(root, new StringBuilder(), smallest);
        return smallest.toString();
    }

    private void dfs(TreeNode node, StringBuilder path, StringBuilder smallest) {
        if (node == null) return;

        // Append current node's character to the path
        path.append((char)('a' + node.val));

        // If it's a leaf node, compare and update smallest
        if (node.left == null && node.right == null) {
            String currentString = path.reverse().toString();
            if (smallest.length() == 0 || currentString.compareTo(smallest.toString()) < 0) {
                smallest.setLength(0);
                smallest.append(currentString);
            }
            path.reverse(); // backtrack by reversing again
        }

        // Recursively traverse left and right subtrees
        dfs(node.left, path, smallest);
        dfs(node.right, path, smallest);

        // Backtrack: remove the current node's character from the path
        path.setLength(path.length() - 1);
    }

    public static void main(String[] args) {

    }
}
