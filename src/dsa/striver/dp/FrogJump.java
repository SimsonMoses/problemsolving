package dsa.striver.dp;

/*
 */

public class FrogJump {

    public static void main(String[] args) {
        int height[] = {10, 30, 40, 20, 50};
        FrogJump frogJump = new FrogJump();
        int n = height.length;
        int ans = frogJump.solve(n - 1, height);
        System.out.println("Minimum cost to reach the last stone: " + ans);
        int k = 4; // Maximum jump distance
        int ansK = frogJump.solveK(n - 1, height, k);
        System.out.println("Minimum cost to reach the last stone with max jump " + k + ": " + ansK);
    }

    // This method allows the frog to jump up to 2 stones at a time
    public int solve(int index, int[] height) {
        if (index == 0)
            return 0;
        int left = solve(index - 1, height) + Math.abs(height[index - 1] - height[index]);
        int right = Integer.MAX_VALUE; // Initialize right to a large value
        if(index>1)
            right = solve(index - 2, height) + Math.abs(height[index - 2] - height[index]);
        return Math.min(left, right);
    }

    // This method allows the frog to jump up to k stones at a time
    public int solveK(int index, int[] height, int k) {
        if (index == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k && index - i >= 0; i++) {
            int jump = solveK(index - i, height, k) + Math.abs(height[index] - height[index - i]);
            min = Math.min(min, jump);
        }
        return min;
    }

}
