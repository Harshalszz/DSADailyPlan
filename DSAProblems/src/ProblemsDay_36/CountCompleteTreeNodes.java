package ProblemsDay_36;

import ProblemsDay_25.TreeNode;

public class CountCompleteTreeNodes {
    //https://leetcode.com/problems/count-complete-tree-nodes/

    public int countNodes(TreeNode root) {

        if(root == null){
            return 0;
        }
        // just checking the height of left from root and height from right from root
        int left = heightOfLeft(root);
        int right = heightOfRight(root);
        // if both height are equal , means all nodes are filled in everylevel
        if(left == right){
            //we can use the formaula for complete n tree to calcaulate the number of nodes
            // 2^n -1
            return (2<<(left))-1;
        }else{
            //if left and right is not eqaul, the, 1 + node of left + node of right
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }

    public static int heightOfLeft(TreeNode node){
        int count = 0;

        while(node.left!=null){
            count++;
            node = node.left;
        }

        return count;
    }

    public static int heightOfRight(TreeNode node){
        int count = 0;

        while(node.right!=null){
            count++;
            node = node.right;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
