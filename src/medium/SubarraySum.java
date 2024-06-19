package medium;

import java.util.ArrayList;
import java.util.List;

class SolutionSubArray {
    public static int isSum(int[] nums,int l,int m,int k){
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=l;i<=m;i++){
            sum += nums[i];
            list.add(nums[i]);
        }
        if(sum%k==0){
            return 1;
        }
        return 0;
    }
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count =0;
        int right =0,left=0;
        for(int i=0;i<nums.length;i++){
            // for(int j=i;j<nums.length;j++){
            //     sum += isSum(nums,i,j,k);
            // }
            left=i;
            right=i;
            sum=nums[left];
            if(sum%k==0){
                count++;
            }
            while(right<nums.length){
                sum+=nums[right];
                right++;
                if(sum%k==0){
                    count++;
                }
                sum=nums[left];
            }
        }
        return count;
    }
}

public class SubarraySum {
    public static void main(String[] args) {
        SolutionSubArray solution = new SolutionSubArray();
        System.out.println(solution.subarraysDivByK(new int[]{4,5,0,-2,-3,1},5));
    }
}
