class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        pairSum = list()
        n = len(nums)
        
        for i in range(n // 2):
            pairSum.append(nums[i] + nums[n - i - 1])

        return max(pairSum)
        