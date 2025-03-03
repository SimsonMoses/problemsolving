package easy;

public class Sqrt {
    public static void main(String[] args) {
        mySqrt(3);
    }

    public static int mySqrt(int x) {
        double result = Math.sqrt(x);
        for (int i = 1; i < 120; i++) {
            if (result <= i*i) {
                return i;
            }
        }
        return x;
    }
}
