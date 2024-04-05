class Solution:
    def maxSubArray(self, nums):
        mx = float('-inf')
        summation = 0
        
        for num in nums:
            summation += num
            mx = max(summation, mx)
            if summation < 0:
                summation = 0
                
        return mx

