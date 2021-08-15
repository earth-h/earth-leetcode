class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ans = 0
        
        if len(mat) % 2 == 0:
            for idx in range(len(mat) // 2):
                ans +=  (mat[idx][idx] + mat[idx][len(mat) - idx - 1] + mat[len(mat) - idx - 1][idx] + mat[len(mat) - idx - 1][len(mat) - idx - 1])
        else:
            for idx in range(len(mat) // 2):
                ans += (mat[idx][idx] + mat[idx][len(mat) - idx - 1] + mat[len(mat) - idx - 1][idx] + mat[len(mat) - idx - 1][len(mat) - idx - 1])
            ans += mat[len(mat) // 2][len(mat) // 2]
        return ans