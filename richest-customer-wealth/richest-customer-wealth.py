class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans = 0 
        for customer in accounts:
            money = 0
            for m in customer:
                money += m
            if ans < money:
                ans = money
        return ans        
        