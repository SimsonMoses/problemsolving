package easy;

public class MaximumAscendingSubArray {
    public static void main(String[] args) {
        MaximumAscendingSubArray maximumAscendingSubArray = new MaximumAscendingSubArray();
        int nums[] = {10,20,30,5,10,50};
        System.out.println(maximumAscendingSubArray.maxAscendingSum(nums));

    }
    public int maxAscendingSum(int[] nums) {
        boolean isBreak = false;
        int max = nums[0],count =0;
        int n = nums.length,prev=0;
        for (int current : nums) {
            if (prev < current) {
                count += current;
            } else {
                count = current;
            }
            prev = current;
            max = Math.max(count, max);
        }
        return max;
    }
}
