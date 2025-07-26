package dsa.striver.dp;

public class NinjaTraining {
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[][] dp = new int[n][4];
        // for (int i = 0; i < n; i++)
        //     Arrays.fill(dp[i], -1);
        // return solve(n-1,3,points,dp);

// tabulation method
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][1], points[0][0]);
        dp[0][3] = Math.max(points[0][1], Math.max(points[0][2], points[0][0]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int i = 0; i < 3; i++) {
                    if (i != last) {
                        int point = points[day][i] + dp[day - 1][i];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n - 1][3];
    }

    public static int solve(int index, int last, int[][] p, int[][] dp) {
        if (index == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, p[0][i]);
                }
            }
            return max;
        }
        if (dp[index][last] != -1)
            return dp[index][last];

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int points = p[index][i] + solve(index - 1, i, p, dp);
                max = Math.max(max, points);
            }
        }
        dp[index][last] = max;
        return max;
    }
}
