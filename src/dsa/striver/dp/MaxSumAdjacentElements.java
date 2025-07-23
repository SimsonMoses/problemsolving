package dsa.striver.dp;

import java.util.ArrayList;

public class MaxSumAdjacentElements {


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(10);
        nums.add(7);
        System.out.println(maximumNonAdjacentSum(nums)); // Output: 15
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        // Write your code here.
        int n = nums.size();
        int[] list = new int[n];
        // Arrays.fill(list,-1);
        // return solve(n-1,nums,list);
        // tabulation
        // list[0] = nums.get(0);
        // for(int i=1;i<n;i++){
        // 	int take = nums.get(i);
        // 	if(i>1)
        // 		take += list[i-2];
        // 	int notTake = 0 + list[i-1]; // just to understand add zero
        // 	list[i] = Math.max(take,notTake);
        // }
        // return list[n-1];

        // space optimized in tabulation
        int prev = nums.get(0), prev2 = 0;
        for (int i = 1; i < n; i++) {
            int take = nums.get(i);
            if (i > 1)
                take += prev2;
            int notTake = 0 + prev;
            int ci = Math.max(take, notTake);
            prev2 = prev;
            prev = ci;
        }
        return prev;
    }


    public static int solve(int index, ArrayList<Integer> nums, int[] list) {
        if (index == 0)
            return nums.get(index);
        if (index < 0)
            return 0;
        if (list[index] != -1)
            return list[index];

        int take = nums.get(index) + solve(index - 2, nums, list);
        int notTake = 0 + solve(index - 1, nums, list);
        list[index] = Math.max(take, notTake);
        return list[index];
    }
}
