class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        # return maximum (nums[i]-1) * (nums[j]-1)
        nums.sort()
        return (nums[-1] - 1) * (nums[-2] - 1)