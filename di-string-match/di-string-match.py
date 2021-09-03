class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        lo, hi = 0, len(s)
        ans = []
        for c in s:
            if c == 'I':
                ans.append(lo)
                lo += 1
            elif c == 'D':
                ans.append(hi)
                hi -= 1
        return ans + [lo]