package graph.problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Subarraysub {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int start=0;
        while(true){
            int sum = 0;
            int end =0;
            for(int i=start;i<n;i++){
                sum+=arr[i];
                end = i;
                if(sum==s){
                    return new ArrayList<>(Arrays.asList(start+1,end+1));
                }
            }
            if(sum>s){
                start++;
            }
            if(start==n-1){
                return new ArrayList<>(Arrays.asList(-1));
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(arr,10,5));
    }
}
//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions