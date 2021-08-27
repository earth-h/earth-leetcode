class Solution:
    def sumBase(self, n: int, k: int) -> int:
        if k == 10:
            return sum(int(i) for i in str(n))
        ans = 0
        while n:
            ans += n % k
            n //= k
        return ans