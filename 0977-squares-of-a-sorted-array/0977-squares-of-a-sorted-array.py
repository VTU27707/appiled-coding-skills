class Solution(object):
    def sortedSquares(self, nums):
        nums=[x**2 for x in nums]
        nums.sort()
        return nums
        
        