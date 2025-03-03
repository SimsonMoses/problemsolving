package easy;

import java.util.logging.Logger;

public class LongestStrictlyIncreaseArray {
    public static void main(String[] args) {
        LongestStrictlyIncreaseArray lo = new LongestStrictlyIncreaseArray();
        System.out.println(lo.longestMonotonicSubarray(new int[]{1,4,3,3,2}));
    }

    public int longestMonotonicSubarray(int[] nums) {
        int maxCount = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }else{
                count = 1;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }


//    public int longestMonotonicSubarray(int[] nums) {
//        boolean isIn=false, isDe=false;
//        int maxCount = 0;
//        int count=1;
//        int preIndex=0;
//        for(int i=0;i<nums.length-1;i++){
//            if( nums[i]<nums[i+1]){
//                if(isIn){
//                    count++;
//                }else{
//                    isIn = true;
//                    count=1;
//                    isDe = false;
//                    preIndex = i;
//                }
//            }else if(nums[i]>nums[i+1]){
//                if(isDe){
//                    count++;
//                }else{
//                    isDe = true;
//                    count=1;
//                    isIn = false;
//                    preIndex = i;
//                }
//            }
//
//
//
//            maxCount = Math.max(i-preIndex,maxCount);
//        }
//        return maxCount;
//    }
}
