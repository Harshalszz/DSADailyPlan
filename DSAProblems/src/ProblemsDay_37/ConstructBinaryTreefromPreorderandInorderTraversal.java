package ProblemsDay_37;

import ProblemsDay_25.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();
        //storing inorder array index hash map
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }

        TreeNode root = construct(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);

        return root;

    }

    public static TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){

        if(preStart>preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]); // as it is preorder the first ele will always be the root node

        int inroot = map.get(root.val);
        int numLeft = inroot - inStart;
        // here pass the left preorder array and inorder array
        root.left = construct(preorder, preStart+1, preStart + numLeft, inorder, inStart, inroot-1, map);

        root.right = construct(preorder, preStart+numLeft +1, preEnd, inorder, inroot+1, inEnd,map);

        return root;


    }

    public static void main(String[] args) {

    }
}
