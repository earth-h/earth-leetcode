class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int idx = 0; idx < nums.length; idx++) {
            List<Integer> idxList = new ArrayList<>();
            if(map.containsKey(nums[idx])) 
                idxList = map.get(nums[idx]);
            
            idxList.add(idx);
            map.put(nums[idx], idxList);
        }
        for(int idx = 0; idx < nums.length; idx++) {
            if(target - nums[idx] != nums[idx] && map.containsKey(target - nums[idx]))
                return new int[] {idx, map.get(target - nums[idx]).get(0)};
            if(target - nums[idx] == nums[idx] && map.get(nums[idx]).size() == 2)
                return new int[] {idx, map.get(nums[idx]).get(1)};
        }
        return new int[2];
    }
}