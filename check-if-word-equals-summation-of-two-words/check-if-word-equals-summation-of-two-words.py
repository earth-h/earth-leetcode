class Solution:
    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        # a(0) b(1) c(2) d(3) e(4) f(5) g(6) h(7) i(8) j(9)
        f, s, t = 0, 0, 0
        for i in firstWord:
            f = f * 10 + ord(i) - 97
        for i in secondWord:
            s = s * 10 + ord(i) - 97
        for i in targetWord:
            t = t * 10 + ord(i) - 97
        if f + s == t:
            return True
        return False