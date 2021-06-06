class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        ans = 0
        for num in nums:
            ans += num
        for i in range(1, len(nums) + 1):
            if i == 1:
                continue
            for j in combinations(nums, i):
                tmpVar = 0
                for k in j:
                    tmpVar = tmpVar ^ k
                ans += tmpVar
        return ans