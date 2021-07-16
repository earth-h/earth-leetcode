class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        new_s = list()
        ans = ""
        for i in s:
            new_s.append(i)
        
        for i in range(len(indices)):
            new_s[indices[i]] = s[i]
        
        for i in new_s:
            ans += i
            
        return ans