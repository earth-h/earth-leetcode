class Solution:
    def sortString(self, s: str) -> str:
        uniqueSet = sorted(set(s))
        sList = sorted(list(s))
        ans = []
        while len(sList) != 0:
            for us in uniqueSet:
                ans.append(us)
                sList.remove(us)
            uniqueSet = sorted(set(sList), reverse=True)
            for us in uniqueSet:
                ans.append(us)
                sList.remove(us)
            uniqueSet = sorted(set(sList))
        return "".join(ans)