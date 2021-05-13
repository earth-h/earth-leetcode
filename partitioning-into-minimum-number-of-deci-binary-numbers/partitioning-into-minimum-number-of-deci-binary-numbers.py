class Solution:
    def minPartitions(self, n: str) -> int:
        max_num = 0
        for i in range(len(n)):
            if max_num < int(n[i]):
                max_num = int(n[i])
        return max_num