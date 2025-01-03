package medium;


public class NumberWayToSplitArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0};
        System.out.println(waysToSplitArray(nums));

    }

    public static int waysToSplitArray(int[] nums) {
        int total = calculateTotal(nums);
        int n = nums.length;
        int count = 0;
        int current = 0;
        for(int i = 1; i<n;i++){
            current = upToInteger(nums[i],current);
            if(current>=(total-current)){
                count++;
            }
        }
        return count;
    }

    public static int calculateTotal(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }

    public static int upToInteger(int nums,int index){
        return nums+index;
    }
}
