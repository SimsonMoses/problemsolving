package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k = j+1;
                int m = n-1;
                while(k<m){

                    long t = (long) nums[i] + nums[j] + nums[k] + nums[m];
                    if(t<target){
                        k++;
                    }else if(t>target){
                        m--;
                    }else{
                        if(list.contains(Arrays.asList(nums[i],nums[j],nums[k],nums[m]))){
                            k++;
                            m--;
                            continue;
                        }
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
                        k++;
                        while(k<m && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<m && nums[m]==nums[m-1]){
                            m--;
                        }
                    }

                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int nums[] = {2,2,2,2,2};
        int target = 8;
        System.out.println(fourSum.fourSum(nums, target));
    }
}
