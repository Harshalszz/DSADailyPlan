package ProblemsDay_37;

import ProblemsDay_25.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    //https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> map = new HashMap<>();
        //storing inorder array indesx hash map
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }

        TreeNode root = construct(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);

        return root;

    }

    public static TreeNode construct(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){

        if(postStart>postEnd || inStart > inEnd){
            return null;
        }
        //as in post order the root will be at last
        TreeNode root = new TreeNode(postorder[postEnd]); //last ele will be the root as it is post order

        int inroot = map.get(root.val);
        int numLeft = inroot - inStart;

        root.left = construct(postorder, postStart, postStart + numLeft-1, inorder, inStart, inroot-1, map);

        root.right = construct(postorder, postStart+numLeft, postEnd-1, inorder, inroot+1, inEnd,map);

        return root;


    }

    public static void main(String[] args) {

    }
}
