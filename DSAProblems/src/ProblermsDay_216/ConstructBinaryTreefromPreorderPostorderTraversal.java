package ProblermsDay_216;

import ProblemsDay_25.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreefromPreorderPostorderTraversal {
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/?envType=problem-list-v2&envId=binary-tree
    int preIndex = 0;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i = 0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return helper(preorder,postorder,0,preorder.length-1);

    }

    public TreeNode helper(int []preorder, int[]postorder, int start, int end){
        if(start>end || preIndex>=preorder.length)return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(start==end) return root;
        int leftNodeIndex = map.get(preorder[preIndex]);
        root.left = helper(preorder,postorder,start,leftNodeIndex);
        root.right = helper(preorder,postorder,leftNodeIndex+1,end-1);

        return root;


    }
    public static void main(String[] args) {

    }
}
