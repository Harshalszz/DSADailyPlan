package ProblemsDay_35;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    //https://leetcode.com/problems/binary-tree-paths/

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(root, path, ans);
        return ans;
    }

    private void dfs(TreeNode node, List<String> path, List<String> ans) {
        if (node == null) return;

        path.add(Integer.toString(node.val));
        if (node.left == null && node.right == null) {
            ans.add(String.join("->", path));
        } else {
            dfs(node.left, path, ans);
            dfs(node.right, path, ans);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {

    }
}
