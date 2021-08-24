class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        ans = []
        for i in range(left, right + 1):
            isSelfDividingNum = True
            for s in str(i):
                if s == '0' or i % int(s) != 0:
                    isSelfDividingNum = False
                    break
            if isSelfDividingNum:
                ans.append(i)
        return ans