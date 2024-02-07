package medium;

import java.util.Arrays;

class Solution01 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        double ans = 0;
        if(arr.length%2==0){
            int n = arr.length/2;
            ans = (arr[n]+arr[n-1])/2;
        }else{
            int n = arr.length/2;
            ans = arr[n];
        }
        return ans;
    }
}

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] a1 = new int[]{1,3};
        int[] a2 = new int[]{2};
        System.out.println(s.findMedianSortedArrays(a1,a2));
    }
}
