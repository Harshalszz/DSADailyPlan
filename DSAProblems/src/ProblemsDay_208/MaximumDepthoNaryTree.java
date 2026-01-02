package ProblemsDay_208;

import ProblemsDay_32.Node;

public class MaximumDepthoNaryTree {
//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/?envType=problem-list-v2&envId=depth-first-search
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int maxDepth=0;
        for(Node child: root.children){
            maxDepth=Math.max(maxDepth,maxDepth(child));
        }
        return maxDepth+1;
    }
    public static void main(String[] args) {

    }
}
