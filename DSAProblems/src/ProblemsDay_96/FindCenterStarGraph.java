package ProblemsDay_96;

public class FindCenterStarGraph {
//https://leetcode.com/problems/find-center-of-star-graph/?envType=problem-list-v2&envId=graph
    //As we know that there exists a center node
    //SO will compare first two edges and check what is common node

    public int findCenter(int[][] edges) {

        int[] e1 = edges[0];
        int[] e2 = edges[1];

        return (e1[0] == e2[0] || e1[0] == e2[1] ) ? e1[0] :e1[1];

    }

    public static void main(String[] args) {

    }
}
