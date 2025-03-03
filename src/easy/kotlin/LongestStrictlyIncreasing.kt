package easy.kotlin

import kotlin.math.max

class LongestStrictlyIncreasing {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        if (nums.isEmpty()) return 0;

        var count = 1;
        var maxCount = 1;
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                count++;

            } else {
                count = 1;
            }
            maxCount = max(maxCount, count);
        }
        count = 1;
        for (i in 1 until nums.size) {
            if (nums[i] < nums[i - 1]) {
                count++;

            } else {
                count = 1;
            }
            maxCount = max(maxCount, count);
        }
        return maxCount;
    }
}