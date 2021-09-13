class Solution:
    def minTimeToType(self, word: str) -> int:
        # -1 or +1, 0 ~ 25
        cur, ans = 'a', 0
        for w in word:
            ans += min(abs(ord(w) - ord(cur)), 26 - abs(ord(w) - ord(cur)))
            cur = w
            ans += 1
        return ans