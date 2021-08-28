class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        cnt = collections.Counter(nums)
        for i in cnt.keys():
            if cnt[i] == len(nums) // 2:
                return i