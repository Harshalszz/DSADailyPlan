package ProblemsDay_229;

import java.util.ArrayList;
import java.util.List;

public class PathZigzagLabelledBinaryTree {

    //https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/?envType=problem-list-v2&envId=tree
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> res = new ArrayList<>();
        recursion(label, res);
        return res;
    }

    private void recursion(int label, List<Integer> res) {
        res.add(0, label);
        if (label == 1) {
            return;
        }
        int level = (int)(Math.log(label) / Math.log(2)) + 1;
        int lowerBound = (int) Math.pow(2, level - 1);
        int upperBound = lowerBound * 2 - 1;
        int diff = upperBound - label;
        int newNode = lowerBound + diff;
        int rootNode = newNode / 2;
        recursion(rootNode, res);
    }
    public static void main(String[] args) {

    }
}
