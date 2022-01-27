class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(map.get(num) != null)
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for(int num: nums) {
            if(map.get(num - k) != null)
                ans += map.get(num - k);
        }
        return ans;
    }
}
// class Solution {
//     public int countKDifference(int[] nums, int k) {
//         int ans = 0;
//         for(int i = 0; i < nums.length - 1; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] - nums[j] == k || nums[i] - nums[j] == -k)
//                     ans++;
//             }
//         }
//         return ans;
//     }
// }