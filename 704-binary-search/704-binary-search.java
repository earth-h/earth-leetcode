class Solution {
    public int search(int[] nums, int target) {
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] > target) break;
            else if(nums[idx] == target) return idx;
        }
        return -1;
    }
}