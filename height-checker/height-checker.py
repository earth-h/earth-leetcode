class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        cnt = collections.Counter(heights)
        i, ans = 1, 0
        for h in heights:
            while cnt[i] == 0:
                i += 1
            if i != h:
                ans += 1
            cnt[i] -= 1 # 현재 위치가 i여야 하므로 1 지움
        return ans
        '''
        ans = 0
        for i, j in list(zip(heights, sorted(heights))):
            if i != j:
                ans += 1
        return ans
        '''