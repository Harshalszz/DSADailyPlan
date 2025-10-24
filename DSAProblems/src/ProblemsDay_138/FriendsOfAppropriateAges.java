package ProblemsDay_138;

import java.util.Arrays;

public class FriendsOfAppropriateAges {
//https://leetcode.com/problems/friends-of-appropriate-ages/?envType=problem-list-v2&envId=binary-search

    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        int [] cnt = new int[121];
        for (int i = 0; i<n; i++) {
            int lo = 0, hi = i-1, res = -1;
            // lower bound
            while (lo<=hi) {
                int mid = (lo+hi)/2;
                if (0.5*ages[i]+7.0>=ages[mid]) {
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                    res = mid;
                }
            }
            if (res!=-1) {
                ans+=(i-res);
                ans+=cnt[ages[i]];
            }
            cnt[ages[i]]++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
