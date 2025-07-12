package ProblemsDay_36;

import ProblemsDay_25.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    //https://leetcode.com/problems/path-sum-ii/
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> resList = new ArrayList<>();

        if(root == null){
            return resList;
        }

        dfs(root,0, resList, new ArrayList<>(), targetSum);

        return resList;

    }

    public static void dfs(TreeNode node, int sum, List<List<Integer>> resList, List<Integer> tempList, int targetSum){

        if(node == null){
            return;
        }

        sum += node.val;
        tempList.add(node.val);

        if(node.left == null && node.right == null && sum == targetSum){
            resList.add(new ArrayList(tempList));
        }

        dfs(node.left, sum, resList,tempList,targetSum);

        dfs(node.right, sum, resList,tempList,targetSum);

        tempList.remove(tempList.size()-1);

    }

    public static void main(String[] args) {

    }
}
