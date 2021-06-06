class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        ans = 0
        for i in range(1, len(nums) + 1):
            for j in combinations(nums, i):
                tmpVar = 0
                for k in j:
                    tmpVar = tmpVar ^ k
                ans += tmpVar
        return ans