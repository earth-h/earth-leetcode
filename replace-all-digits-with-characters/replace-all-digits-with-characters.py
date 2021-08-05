class Solution:
    def replaceDigits(self, s: str) -> str:
        # shift(c, x) > c는 character, x는 digit > c로부터 x번째 charater 도출 => shift(c, x) = char(ascii + x)
        ans = ""
        for i in range(len(s) // 2):
            ans += self.shift(s[2 * i], int(s[2 * i + 1]))
        if len(s) % 2 == 1:
            ans += s[-1]
        return ans
        
    def shift(self, c: chr, x: int) -> chr:
        return c + chr(ord(c) + x)