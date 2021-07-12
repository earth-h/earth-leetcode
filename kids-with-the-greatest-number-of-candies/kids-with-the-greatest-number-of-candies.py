class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCandies = max(candies)

        return [i + extraCandies >= maxCandies for i in candies]
'''        
        for i in range(0, len(candies)):
            if candies[i] + extraCandies >= maxCandies:
                ans.append(True)
            else:
                ans.append(False)
        return ans
'''