class Solution:
    def generateTheString(self, n: int) -> str:
        if n % 2 == 0: #even
            return "".join(['a' for _ in range(n - 1)] + ['b'])
        else:
            return "".join(['a' for _ in range(n)])