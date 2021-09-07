class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        ans = []
        for idx in range(len(arr) - 1):
            ans.append(max(arr[idx+1:]))
        ans.append(-1)
        return ans