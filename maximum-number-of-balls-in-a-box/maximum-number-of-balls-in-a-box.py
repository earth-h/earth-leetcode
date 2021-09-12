class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        # have n balls (n = highLimit - lowLimit + 1)
        # n balss numbered from lowLimit ~ highLimit
        cnt = collections.Counter(sum(list(map(int, str(i)))) for i in range(lowLimit, highLimit + 1))
        #for i in range(lowLimit, highLimit + 1):
        #    print(sum(list(map(int, str(i)))))
        return max(cnt.values())