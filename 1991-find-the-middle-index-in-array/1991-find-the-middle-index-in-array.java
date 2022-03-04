class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length == 1) return 0;
        
        int ans = 0, cur = 0;
    
        for(int num: nums)
            ans += num;
        
        for(int idx = -1; idx < nums.length - 1; idx++) {
            if(idx >= 0) cur += nums[idx];
            if(ans - nums[idx + 1] == cur * 2)
                return idx + 1;
        }
        return -1;
    }
}