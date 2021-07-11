class Solution:
    def defangIPaddr(self, address: str) -> str:
        ans = ''
        cnt = 0
        for i in address.split("."):
            ans += i
            if cnt < 3:
                ans += '[.]'
                cnt += 1
        return ans