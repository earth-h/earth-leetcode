class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costLen = cost.length;
        int i = 2;
        int[] minCost = new int[costLen];
        // minCost[i] = cost[i] + min(minCost[i-1], minCst[i-2])
        if(costLen < 2)
            return cost[0];
        else {
            minCost[0] = cost[0];
            minCost[1] = cost[1];
            while(i < costLen) {
                minCost[i] = minCost[i - 1] > minCost[i - 2] ? cost[i] + minCost[i - 2] : cost[i] + minCost[i - 1];
                i += 1;
            }
        }
        return minCost[costLen - 1] > minCost[costLen - 2] ? minCost[costLen - 2] : minCost[costLen - 1];
    }
}