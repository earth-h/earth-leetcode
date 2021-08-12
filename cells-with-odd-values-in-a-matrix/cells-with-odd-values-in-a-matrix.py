class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        matrix = [[0] * n for _ in range(0, m)]
        for r, c in indices:
            matrix[r] = [i + 1 for i in matrix[r]]
            for i in range(0, m):
                matrix[i][c] += 1
        ans = 0
        for i in matrix:
            for j in i:
                if j % 2 == 1:
                    ans += 1
        return ans