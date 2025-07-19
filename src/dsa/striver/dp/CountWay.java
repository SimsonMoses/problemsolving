package dsa.striver.dp;

public class CountWay {
    public static void main(String[] args) {

        int n = 3; // Example input
        CountWay countWay = new CountWay();
        int result = countWay.solve(n);
        System.out.println("Number of ways to reach the " + n + "th step: " + result);

    }


    public int solve(int index) {


        if (index == 0 || index == 1) {
            return 1;
        }
        int left = solve(index - 1);
        int right = solve(index - 2);
        return left + right;

    }
}
