package medium;

import java.util.Arrays;

class ArrayPairSolution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k];
        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;
            if (rem < 0) {
                rem += k;
            }
            freq[rem]++;
        }
        if (freq[0] % 2 != 0) {
            return false;
        }
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }


}


//1497. Check If Array Pairs Are Divisible by k
public class ArrayPairDivisibleByK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 7;
        ArrayPairSolution solution = new ArrayPairSolution();
        System.out.println(solution.canArrange(arr, k));

    }
}
