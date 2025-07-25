package ProblemsDay_40;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {

    //https://leetcode.com/problems/delete-nodes-and-return-forest/

    private TreeNode deleteHelper(TreeNode root, Set<Integer> toDelete, List<TreeNode> result) {
        if (root == null) {
            return null;
        }

        root.left = deleteHelper(root.left, toDelete, result);
        root.right = deleteHelper(root.right, toDelete, result);

        if (toDelete.contains(root.val)) {
            if (root.left != null) {
                result.add(root.left);
            }
            if (root.right != null) {
                result.add(root.right);
            }
            return null;
        } else {
            return root;
        }
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();

        for (int num : to_delete) {
            toDelete.add(num);
        }

        deleteHelper(root, toDelete, result);

        if (!toDelete.contains(root.val)) {
            result.add(root);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
