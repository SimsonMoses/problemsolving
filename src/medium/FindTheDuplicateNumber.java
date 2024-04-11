package medium;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/find-the-duplicate-number/description/?envType=daily-question&envId=2024-03-24

class SolutionDuplicate {
    public int findDuplicate(int[] nums) {
        if(nums.length<=0)
            return 0;
        if(nums.length==1)
            return 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<nums.length;i++){
//            if(list.contains(nums[i])){
//                return nums[i];
//            }
            int num = nums[i];
            if(!set.contains(num)){
                return num;
            }
//            list.add(nums[i]);
            set.add(num);
            // previousNum = nums[i];
        }
        return nums[0];
    }
}

class SolutionOptimized {
    public int findDuplicate(int[] nums) {
        boolean number[] = new boolean[nums.length];
        for(int i:nums){
            if(number[i]){
                return i;
            }
            number[i]=true;
        }
        return nums[0];
    }
}


public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,6,2,9};
        SolutionDuplicate solutionDuplicate = new SolutionDuplicate();
        System.out.println(solutionDuplicate.findDuplicate(nums));
//        List<Integer> list = Arrays.asList(nums);
//        List<Integer> finalList = list;
//        list = list.stream().filter(i-> Collections.frequency(finalList,i)>1).collect(Collectors.toList());
//        return Integer.parseInt(list.get(0).toString());
    }
}