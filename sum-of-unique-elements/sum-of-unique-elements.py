class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        cnt = collections.Counter(nums)
        return sum(i for i in cnt.keys() if cnt[i] == 1)