class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000, max = 0, result = 0, pLen = prices.length;
        for(int i = 0; i < pLen - 1; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            if(max < prices[i] && prices[i] > prices[i + 1]) {
                max = prices[i];
                result = max > min ? result + (max - min) : result;
                min = 10000;
                max = 0;
            }   
        }
        
        if(max < prices[pLen - 1]) {
            max = prices[pLen - 1];
            result = max > min ? result + (max - min) : result;
        }
        
        return result;
    }
}