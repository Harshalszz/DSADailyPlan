package ProblemsDay_222;

import java.util.ArrayList;
import java.util.List;

public class ImageOverlap {

    //https://leetcode.com/problems/image-overlap/?envType=problem-list-v2&envId=array
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<int[]> pos1=new ArrayList<>();
        List<int[]> pos2=new ArrayList<>();
        int n=img1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1){
                    pos1.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    pos2.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        int[][] freq=new int[2*n-1][2*n-1];
        for(int[] p1: pos1){
            for(int[] p2: pos2){
                int r=p1[0]-p2[0];
                int c=p1[1]-p2[1];
                freq[r+n-1][c+n-1]++;
                ans=Math.max(ans,freq[r+n-1][c+n-1]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
