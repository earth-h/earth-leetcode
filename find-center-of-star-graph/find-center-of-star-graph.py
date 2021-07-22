class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        ans = [0] * (len(edges) + 1) # index 0 => 1
        for i, j in edges:
            ans[i - 1] += 1
            ans[j - 1] += 1
            if ans[i - 1] > 1:
                return i
            elif ans[j - 1] > 1:
                return j
        