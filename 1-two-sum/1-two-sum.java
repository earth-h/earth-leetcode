class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int idx = 0; idx < nums.length; idx++) {
            if(map.containsKey(target - nums[idx])) {
                result[0] = map.get(target - nums[idx]);
                result[1] = idx;
                break;
            }
            map.put(nums[idx], idx);
        }
        
        return result;
    }
}