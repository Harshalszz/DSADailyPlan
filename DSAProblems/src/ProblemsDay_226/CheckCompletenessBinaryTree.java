package ProblemsDay_226;

import ProblemsDay_25.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessBinaryTree {

//    //https://leetcode.com/problems/check-completeness-of-a-binary-tree/?envType=problem-list-v2&envId=breadth-first-search
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode rv = null;
        boolean past = false;
        while(!q.isEmpty()){
            rv = q.poll();
            if(rv == null) past = true;
            else{
                if(past==true) return false;
                q.add(rv.left);
                q.add(rv.right);
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
