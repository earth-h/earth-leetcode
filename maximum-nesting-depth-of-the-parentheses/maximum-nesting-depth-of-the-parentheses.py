class Solution:
    def maxDepth(self, s: str) -> int:
        ans = 0
        tmp_ans = 0
        for i in s:
            if i == "(":
                tmp_ans += 1
            elif i == ")":
                ans = max(ans, tmp_ans)
                tmp_ans = max(0, tmp_ans - 1)
        
        return ans