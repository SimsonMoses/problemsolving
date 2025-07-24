package dsa.striver.dp;

public class HouseRobber {

    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println(maxMoneyLooted(houses)); // Output: 12
    }

    public static int maxMoneyLooted(int[] houses) {
        //Your code goes here
        int n = houses.length;
        // int[] arr = new int[n];
        // Arrays.fill(arr,-1);
        // return solve(n-1,houses,arr);

        int prev = houses[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int left = houses[i] + prev2;
            int right = prev;
            int ci = Math.max(left, right);
            prev2 = prev;
            prev = ci;
        }
        return prev;
    }

    public static int solve(int index, int h[], int[] arr) {
        if (index == 0)
            return h[index];
        if (index < 1)
            return 0;
        if (arr[index] != -1) {
            return arr[index];
        }
        int left = h[index] + solve(index - 2, h, arr);
        int right = solve(index - 1, h, arr);
        arr[index] = Math.max(left, right);
        return arr[index];
    }
}
