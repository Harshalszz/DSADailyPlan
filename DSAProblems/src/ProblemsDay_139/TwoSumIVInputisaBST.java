package ProblemsDay_139;

import ProblemsDay_25.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputisaBST {
    //https://leetcode.com/problems/two-sum-iv-input-is-a-bst/?envType=problem-list-v2&envId=two-pointers

    Set<Integer> set = new HashSet<>();

    boolean helper(TreeNode node, int k) {
        if (node == null) return false;

        if (set.contains(k - node.val)) {
            return true;
        }

        set.add(node.val);

        return helper(node.left, k) || helper(node.right, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);
    }

    public static void main(String[] args) {

    }
}
