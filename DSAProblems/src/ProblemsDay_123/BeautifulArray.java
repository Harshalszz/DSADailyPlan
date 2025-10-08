package ProblemsDay_123;

public class BeautifulArray {

//https://leetcode.com/problems/beautiful-array/?envType=problem-list-v2&envId=divide-and-conquer
    private int[] a;

    public int[] beautifulArray(int n) {
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        solve(0, n, 2);

        return a;
    }

    private void solve(int from, int to, int by) {
        if (to - from <= 2) return;
        int mid = from + (to - from + 1) / 2;
        a[mid] = a[from + 1];
        for (int i = from + 1; i < mid; i++) {
            a[i] = a[i - 1] + by;
        }
        for (int i = mid + 1; i < to; i++) {
            a[i] = a[i - 1] + by;
        }
        solve(from, mid, by * 2);
        solve(mid, to, by * 2);
    }

    public static void main(String[] args) {

    }
}
