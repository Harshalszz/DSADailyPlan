package ProblemsDay_185;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

// https://leetcode.com/problems/pascals-triangle-ii/?envType=problem-list-v2&envId=array
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        int first = 1;
        lst.add(first);
        long res = 1;
        for(int col=1; col<=rowIndex; col++){
            res = res * (rowIndex - col + 1);
            res = res / col;
            lst.add((int)res);
        }
        return lst;
    }
    public static void main(String[] args) {

    }
}
