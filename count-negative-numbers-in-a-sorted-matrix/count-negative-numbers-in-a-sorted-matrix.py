class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        ans = 0
        for li in grid:
            for idx in range(len(li)):
                if li[idx] < 0:
                    ans += (len(li) - idx) 
                    break
        return ans