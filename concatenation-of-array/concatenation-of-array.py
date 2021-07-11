class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        numsLen = len(nums)
        for i in range(0, numsLen):
            nums.append(nums[i])
        return nums