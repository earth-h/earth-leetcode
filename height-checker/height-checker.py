class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        ans = 0
        for i, j in list(zip(heights, sorted(heights))):
            if i != j:
                ans += 1
        return ans