package ProblmesDay_119;

import java.util.Arrays;

public class AssignCookies {

    //https://leetcode.com/problems/assign-cookies/?envType=problem-list-v2&envId=two-pointers

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;
        int i=0, j=0;

        while(i<g.length && j < s.length){

            if(g[i] <= s[j]){
                res++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
