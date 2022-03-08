class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int result = 0, tempResult = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                if(tempResult == 0) {
                    tempResult = nums[i] + nums[i - 1];
                } else {
                    tempResult += nums[i];
                }
            } else {
                tempResult = tempResult == 0 ? nums[i - 1] : tempResult;
                result = result > tempResult ? result : tempResult;
                tempResult = 0;
            }
        }
        result = result > tempResult ? result : tempResult;
        return result;
    }
}