class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        numsLength = len(nums)
        for i in range(0, numsLength):
            nums[i] = nums[i] + (nums[nums[i]] % numsLength) * numsLength
        
        for i in range(0, numsLength):
            nums[i] = int(nums[i] / numsLength)

        return nums