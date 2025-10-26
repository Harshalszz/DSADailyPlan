package ProblemsDay_140;

import ProblemsDay_32.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/?envType=problem-list-v2&envId=stack
    public List<Integer> preorder(Node root) {
        List<Integer> pre = new ArrayList<>();
        if (root == null)
            return pre;
        PreOrder(root, pre);
        return pre;
    }

    private void PreOrder(Node root, List<Integer> pre) {
        if (root == null)
            return;

        pre.add(root.val);
        for (Node node : root.children) {
            PreOrder(node, pre);
        }
    }

    public static void main(String[] args) {

    }
}
