class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        # stones를 key와 value로 나눔
        types = dict()
        ans = 0
        for s in stones:
            if s not in types:
                types[s] = 1
            else:
                types[s] += 1
        for s in jewels:
            if s in types:
                ans += types[s]
        return ans