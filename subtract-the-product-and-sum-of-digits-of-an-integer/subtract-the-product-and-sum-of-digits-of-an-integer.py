class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        productOfDigit = 1
        sumOfDigit = 0
        
        for s in str(n):
            productOfDigit *= int(s)
            sumOfDigit += int(s)
        
        return productOfDigit - sumOfDigit