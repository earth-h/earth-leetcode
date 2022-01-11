class Solution {
    public int search(int[] nums, int target) {
        int numsSize = nums.length;
        if(nums[numsSize/2] == target) {
            return numsSize/2;
        } else if(nums[numsSize/2] > target) {
            for(int i = numsSize/2; i >= 0; i--) {
                if(nums[i] == target) return i;
                if(nums[i] < target) break;
            }
        } else {
            for(int i = numsSize/2; i < numsSize; i++) {
                if(nums[i] == target) return i;
                if(nums[i] > target) break;
            }
        }
        return -1;
    }
}