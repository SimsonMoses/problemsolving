class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left =0
        right = 0
        maxLen =0
        n = len(s)
        map = {}

        while right<n:
            if s[right] in map:
                left = max(left,map[s[right]]+1)
            map[s[right]] = right
            maxLen = max(maxLen,(right-left)+1)
            right+=1
        return maxLen

sol = Solution()

# Call the lengthOfLongestSubstring function on the instance
result = sol.lengthOfLongestSubstring("abcabcbb")

# Print the result
print(result)