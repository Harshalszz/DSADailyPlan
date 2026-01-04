package ProblemsDay_210;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;

public class IncreasingOrderSearchTree {
//https://leetcode.com/problems/increasing-order-search-tree/?envType=problem-list-v2&envId=binary-search-tree
    public static void inorder(ArrayList<TreeNode> ans, TreeNode root){
        if(root==null){
            return;
        }
        inorder(ans,root.left);
        ans.add(root);
        inorder(ans,root.right);
    }
    public static TreeNode tree(ArrayList<TreeNode>ans,int i){
        if(i==ans.size()){
            return null;
        }
        TreeNode root=ans.get(i);
        root.left=null;
        root.right=tree(ans,i+1);
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        inorder(ans,root);
        return tree(ans,0);
    }
    public static void main(String[] args) {

    }
}
