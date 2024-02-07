import numpy as np

class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums1 = nums1 + nums2
        nums1.sort()
        n = len(nums1)
        print(nums1)
        if n % 2 == 0:
            ans = (nums1[n//2-1]+nums1[(n//2)])/2
        else:
            print(nums1[n//2])
            ans = nums1[n//2]
        return ans
sol = Solution()

# Call the lengthOfLongestSubstring function on the instance
my_array1 = [1, 2]
my_array2 = [3,4]
result = sol.findMedianSortedArrays(my_array2,my_array1)

# Print the result
print(result)