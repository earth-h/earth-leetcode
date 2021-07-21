class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        ans = 0
        ruleKeyDict = {"type": 0, "color": 1, "name": 2}
        
        for i in range(len(items)):
            if items[i][ruleKeyDict[ruleKey]] == ruleValue:
                ans += 1
                
        return ans