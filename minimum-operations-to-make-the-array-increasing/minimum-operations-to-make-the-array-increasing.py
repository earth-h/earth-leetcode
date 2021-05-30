class Solution:
    def minOperations(self, nums: List[int]) -> int:
        ansCnt = 0
        for i in range(len(nums) - 1):
            if nums[i] >= nums[i+1]:
                ansCnt += (nums[i] - nums[i+1] + 1)
                nums[i+1] += (nums[i] - nums[i+1] + 1)
        return ansCnt