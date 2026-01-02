package ProblemsDay_208;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {
//https://leetcode.com/problems/print-binary-tree/?envType=problem-list-v2&envId=depth-first-search
    static int m, n;
    static List<List<String>> ans;

    public List<List<String>> printTree(TreeNode root) {
        ans = new ArrayList<>();
        m = 0;
        dfs(root, 1);
        n = (int) (Math.pow(2, m)-1);

        int c = (n-1)/2;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add("");
        }
        list.set(c, String.valueOf(root.val));
        ans.add(list);
        int val = compute(0);
        dfs(root.left, 1, c-val);
        dfs(root.right, 1, c+val);
        return ans;
    }

    int compute(int row){
        return (int) Math.pow(2, m-2-row);
    }

    void dfs(TreeNode node, int row, int col){
        if(node == null)return;
        if(ans.size() == row){
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add("");
            }
            list.set(col, String.valueOf(node.val));
            ans.add(list);
        } else {
            ans.get(row).set(col, String.valueOf(node.val));
        }

        int val = compute(row);
        row++;
        dfs(node.left, row, col-val);
        dfs(node.right, row, col+val);
    }


    void dfs(TreeNode node, int level){
        if(node == null)return;
        m = Math.max(m, level);
        level++;
        dfs(node.left, level);
        dfs(node.right, level);
    }
    public static void main(String[] args) {

    }
}
