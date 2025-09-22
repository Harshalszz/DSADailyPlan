package ProblemsDay_108;

import ProblemsDay_25.TreeNode;

public class StepByStepDirectionsFromBinaryTreeNodeAnother {

    //https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/

    // first will find the LCA of two nodes
    // then from LCA will stire the path
    // and will replcae the start node path with U

    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {

        if(root == null || root.val == p || root.val == q){
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

    public boolean dfs(TreeNode root, int target, StringBuilder path) {
        if (root == null) return false;
        if (root.val == target) return true;

        // Try left
        path.append('L');
        if (dfs(root.left, target, path)) return true;
        path.deleteCharAt(path.length() - 1); // backtrack

        // Try right
        path.append('R');
        if (dfs(root.right, target, path)) return true;
        path.deleteCharAt(path.length() - 1); // backtrack

        return false;
    }



    public String getDirections(TreeNode root, int startValue, int destValue) {

        TreeNode lca = lowestCommonAncestor(root,startValue,destValue );

        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();

        dfs(lca, startValue, pathToStart);
        dfs(lca, destValue, pathToDest);

        // Convert pathToStart to 'U's
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pathToStart.length(); i++) {
            result.append('U');
        }

        result.append(pathToDest);
        return result.toString();

    }

    public static void main(String[] args) {

    }
}
