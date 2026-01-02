package ProblemsDay_208;

import ProblemsDay_25.TreeNode;

public class FindBottomLeftTreeValue {
//https://leetcode.com/problems/find-bottom-left-tree-value/?envType=problem-list-v2&envId=depth-first-search

    int ans=0;
    int maxDepth=-1;
    private void inorder(TreeNode root, int depth){
        if(root==null) return ;
        inorder(root.left,depth+1);
        if(depth>maxDepth){
            maxDepth=depth;
            ans=root.val;
        }
        inorder(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        inorder(root,0);
        return ans;

    }

    public static void main(String[] args) {

    }
}
