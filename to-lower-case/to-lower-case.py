class Solution:
    def toLowerCase(self, s: str) -> str:
        # 'A': 65, 'Z': 90 'a': 97
        ans = ""
        for c in range(len(s)):
            if ord(s[c]) <= 90 and ord(s[c]) >= 65:
                ans += chr(ord(s[c]) + 32)
                #s[c] = chr(ord(s[c]) + 32)
            else:
                ans += s[c]
        return ans