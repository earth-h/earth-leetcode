class Solution:
    def judgeCircle(self, moves: str) -> bool:
        cnt = {'U': [0, 1], 'D': [0, -1], 'R': [1, 0], 'L': [-1,0]}
        cur = [0,0]
        for m in moves:
            cur[0] += cnt[m][0]
            cur[1] += cnt[m][1]
        if cur == [0,0]:
            return True
        else:
            return False