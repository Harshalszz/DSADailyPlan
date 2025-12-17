package ProblemsDay_192;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindtheNumberofWinningPlayers {

    //https://leetcode.com/problems/find-the-number-of-winning-players/
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        int dup[]=new int [10];
        Arrays.fill(dup,0);
        int ct=0;
        for(int i=0;i<pick.length;i++){
            List<Integer> list=new ArrayList();
            list.add(pick[i][0]);
            list.add(pick[i][1]);
            map.put(list,map.getOrDefault(list,0)+1);
            if(map.get(list)>pick[i][0]){
                if(dup[pick[i][0]]==0)ct++;
                dup[pick[i][0]]=1;
            }
        }
        return ct;
    }
    public static void main(String[] args) {

    }
}
