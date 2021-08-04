class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        # 0 <= i < len(arr) - 2
        # i <= j < len(arr) - 1
        # j <= k < len(arr)
        ans = 0
        
        for i in range(0, len(arr) -2):
            for j in range(i + 1, len(arr) -1):
                if -a <= (arr[i] - arr[j]) <= a:
                    for k in range(j + 1, len(arr)):
                        if -b <= (arr[j] - arr[k]) <= b and -c <= (arr[i] - arr[k]) <= c:
                            ans += 1
        return ans