class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int cnt = 0, min = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) cnt++;
            if(nums[i] < target) min++;
        }
        for(int i = min; i < min + cnt; i++)
            result.add(i);
        return result;
    }
}