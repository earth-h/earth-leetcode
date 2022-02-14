class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1, even = 0, len = nums.length;
        
        while(even < len && odd < len) {
            while(odd < len && nums[odd] % 2 == 1) {
                odd += 2;
            }
            while(even < len && nums[even] % 2 == 0) {
                even += 2;
            }
            if(even < len && odd < len) {
                int tmp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = tmp;
            }
        }
        return nums;
    }
}