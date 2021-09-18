class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        ans, cnt = [], collections.Counter(arr)
        for k, v in cnt.items():
            ans.append(v)
        if len(set(ans)) == len(cnt):
            return True
        return False