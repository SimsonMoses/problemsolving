package medium;

import java.util.ArrayList;
import java.util.List;

public class ClosetPrimeNumber {
    public static void main(String[] args) {
        int[] res = closestPrimes(10, 20);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
//            if (left % 2 != 0 && left % 3 != 0 && left % 5 != 0 && left % 7 != 0 && left % 9 != 0) {
//                list.add(left);
//                System.out.println(left);
//
//            }
            if (isPrime(left)) {
                list.add(left);
               System.out.println(left);

            }
            left++;
        }
        int n = list.size();
        if (n == 0) {
            return new int[]{-1, -1};
        }
        int mini = list.get(0);
        int ans[] = new int[2];
        for (int i = 1; i < n; i++) {
            if (mini > list.get(i) - list.get(i-1)) {
                ans[0] = list.get(i - 1);
                ans[1] = list.get(i);
                mini = list.get(i) - list.get(i-1);
            }
        }
        return ans;
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
