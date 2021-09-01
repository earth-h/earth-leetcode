class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        # j > i & prices[j] <= prices[i] (j: minumum index)
        for i in range(len(prices) - 1):
            j = i + 1
            while prices[j] > prices[i]:
                j += 1
                if j == len(prices):
                    break
            if j != len(prices):
                prices[i] = prices[i] - prices[j]
        return prices