class Solution {
    public int maxSubArray(int[] nums) {
        int[] num = new int[nums.length];
        num[0] = nums[0];
        int maxIdx = 0, minIdx = 0, result = num[0];
        for(int i = 1; i < nums.length; i++) {
            num[i] = num[i-1] + nums[i];
            if(num[i] - num[minIdx] > result) {
                result = num[i] - num[minIdx];
                maxIdx = i;
            }
            if(num[i] > result) {
                result = num[i];
                maxIdx = i;
            }
            if(num[i] < num[minIdx]) {
                minIdx = i;
            }
        }
        return result;
    }
}