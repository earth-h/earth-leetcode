class Solution:
    def reverse(self, x: int) -> int:
        newX = x
        isMinus = False
        
        if newX < 0:
            newX = -newX
            isMinus = True
            
        ansList = list()
        
        while newX != 0:
            i = newX // 10
            j = newX % 10
        
            ansList.append(j)
            newX = newX // 10
        
        ans = 0
        
        for i in ansList:
            ans = ans*10 + i
        
        if isMinus is True:
            ans = -ans
        
        if ans < -(2 ** 31) or ans > 2 ** 31 - 1:
            return 0
        
        return ans