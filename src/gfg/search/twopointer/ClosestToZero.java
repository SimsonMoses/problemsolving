package gfg.search.twopointer;

import java.util.Arrays;

public class ClosestToZero {

    public static int closestToZero(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        int sum = Integer.MAX_VALUE;
        int abs = Math.abs(sum);
        while (i < j) {
            if (arr[i] + arr[j] == 0) {
                return 0;
            }
            if (Math.abs(arr[i] + arr[j]) < Math.abs(abs)) {
                sum = arr[i] + arr[j];
                abs = arr[i] + arr[j];
            }
            // we need to find the maximum number closest to zero
            else if (Math.abs(arr[i] + arr[j]) == Math.abs(abs)) {
                sum = Math.max(sum, arr[i] + arr[j]);
            }
            if(arr[i]+arr[j]<0){
                i++;
            }else{
                j--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        int result = closestToZero(arr);
        System.out.println("Closest to zero: " + result);
    }
}
