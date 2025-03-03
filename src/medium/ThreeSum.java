package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int  n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int t = nums[i]+nums[j]+nums[k];
                    if(t==0){
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                        int[] arr = new int[]{nums[i],nums[j],nums[k]};
                        Arrays.sort(arr);
                        if(list.contains(Arrays.asList(arr[0],arr[1],arr[2]))){
                            continue;
                        }
                        list.add(Arrays.asList(arr[0],arr[1],arr[2]));
                    }
                }
            }
        }
        return list;
    }

}
