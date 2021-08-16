class Solution:
    def freqAlphabets(self, s: str) -> str:
        # a to i => 1 to 9
        # j to z =< 10# to 26#
        ans = []
        idx = 0
        while idx < len(s):
            if (idx + 2) < len(s) and s[idx + 2] == '#':
                ans.append(chr(int(s[idx:idx + 2]) + 96))
                idx += 3
            else:
                ans.append(chr(int(s[idx]) + 96))
                idx += 1
        return "".join(ans)
        