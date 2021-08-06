class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        ans = []
        
        firstIdx = 0
        secondIdx = 0
        start = 0
        
        for c in s:
            secondIdx += 1
            if c == "(":
                start += 1
            else:
                start -= 1
            if start == 0:
                ans.append(s[firstIdx + 1: secondIdx - 1])
                firstIdx = secondIdx
        return "".join(ans)