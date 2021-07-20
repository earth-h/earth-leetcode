class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        target = []
        for i in range(len(index)):
            target = target[:index[i]] + [nums[i]] + target[index[i]:]
        return target