class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000, max = 0, result = 0;
        for(int i : prices) {
            if (i < min) {
                min = max = i;
            }
            if (i > max) {
                max = i;
                result = max > min && max - min > result ? max - min : result;
            }
        }
        return result;
    }
}