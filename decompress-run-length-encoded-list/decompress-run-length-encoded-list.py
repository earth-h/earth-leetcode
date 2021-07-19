class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        ans = list()
        for i in range(len(nums) // 2):
            for j in range(nums[i * 2]):
                ans.append(nums[i * 2 + 1])
        return ans