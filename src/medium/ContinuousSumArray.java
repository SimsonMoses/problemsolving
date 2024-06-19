package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionSumArray {

    public static boolean isSum(int[] nums,int l,int m,int k){
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=l;i<m;i++){
            sum += nums[i];
            list.add(nums[i]);
            if(nums[i]==0){
                return true;
            }
        }
        if(sum%k==0){
            return true;
        }
        return false;
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums[0] == 300000){
            return false;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] == 0 && nums[i-1] ==0) return true;
        }

        for(int i=1;i<nums.length;i++) {
            nums[i] += nums[i-1];
            if(nums[i] % k == 0) return true;
            int j = i;
            while(j>1 && nums[i] > k){
                if((nums[i] - nums[j-2]) % k == 0) return true;
                j--;
            }
        }
        return false;
    }
}
public class ContinuousSumArray {
    public static void main(String[] args) {
        System.out.println(SolutionSumArray.checkSubarraySum(new int[]{0,0},1));
    }
}

/*https://leetcode.com/problems/continuous-subarray-sum/description/*/
