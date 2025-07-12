package ProblemsDay_36;
import ProblemsDay_25.TreeNode;

public class PathSum {
    //https://leetcode.com/problems/path-sum/

    //bfs

    //     public boolean hasPathSum(TreeNode root, int targetSum) {

//         if(root == null){
//             return false;
//         }

//         Stack<TreeNode> stackTree = new Stack<>();
//         Stack<Integer> valStack = new Stack<>();

//         stackTree.push(root);
//         valStack.push(root.val);

//         while(!stackTree.isEmpty()){

//             TreeNode temp = stackTree.pop();
//             int tempVal = valStack.pop();

//             if(temp.left == null && temp.right == null && tempVal == targetSum){
//                 return true;
//             }

//             if(temp.left !=null){
//                 stackTree.push(temp.left);
//                 valStack.push(tempVal+ temp.left.val);
//             }

//             if(temp.right !=null){
//                 stackTree.push(temp.right);
//                 valStack.push(tempVal + temp.right.val);
//             }


//         }
//           return false;
//     }

    //dfs
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }

        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }



    public static void main(String[] args) {

    }
}
