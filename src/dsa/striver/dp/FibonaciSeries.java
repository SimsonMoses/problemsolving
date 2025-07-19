package dsa.striver.dp;

import java.util.Arrays;

public class FibonaciSeries {
    public static void main(String[] args) {

        int memo[] = new int[100];
        Arrays.fill(memo, -1);
        FibonaciSeries fibonaciSeries = new FibonaciSeries();
//        System.out.println(fibonaciSeries.solve(5, memo));
        System.out.println(fibonaciSeries.solve2(5));
    }

    // time complexity O(n)
    public int solve(int n, int[] memo) {
        if (n <= 1)
            return n;
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = solve(n - 1, memo) + solve(n - 2, memo);
        return memo[n];
    }

    // time complexity O(n)
    // optimized space
    public int solve2(int n) {
        int prev = 1;
        int prev2 = 0;
        if (n <= 1)
            return n;
        int cur = 0;
        for (int i = 2; i <= n; i++) {
            cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return cur;
    }
}
