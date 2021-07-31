class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        dic = dict(zip(allowed, [True for i in range(len(allowed))]))
        ans = 0
        
        for word in words:
            isExist = True
            for c in word:
                if c not in dic.keys():
                    isExist = False
                    continue
            if isExist:
                ans += 1
        
        return ans