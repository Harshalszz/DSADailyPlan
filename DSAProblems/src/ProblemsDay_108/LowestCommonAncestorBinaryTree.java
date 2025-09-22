package ProblemsDay_108;

import ProblemsDay_25.TreeNode;

public class LowestCommonAncestorBinaryTree {
    //first by using dfs will find the node
    //once any of the two given node is foud
    //we will simple return that node
    // also if both the left and right nod eis not ull then will reun the root itself

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);


        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }else{

            //if both tyhe left and right are not null, then we have find the LCA of p and q
            return root;
        }

    }

    public static void main(String[] args) {

    }
}
