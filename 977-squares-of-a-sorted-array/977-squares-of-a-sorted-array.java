class Solution {
    public int[] sortedSquares(int[] nums) {

        int numSize = nums.length;
        
        if(nums[0] >= 0) {
            for(int idx = 0; idx < nums.length; idx++)
                nums[idx] *= nums[idx];
            return nums;
        }
        
        int[] result = new int[numSize];
        
        int i = 0;
        numSize -= 1;
        int j = numSize; 
        for(;i <= j;) {
            if(nums[i] * nums[i] >= nums[j] * nums[j]) {
                result[numSize--] = nums[i] * nums[i];
                i++;
            } else {
                result[numSize--] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
    // public int[] sortedSquares(int[] nums) {
    //     for(int idx = 0; idx < nums.length; idx++)
    //         nums[idx] *= nums[idx];
    //     Arrays.sort(nums);
    //     return nums;
    // }
}
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         List<Integer> minus = new ArrayList<>();
//         List<Integer> plus = new ArrayList<>();
//         for(int i: nums) {
//             if(i < 0) minus.add(0, i * i);
//             else plus.add(i * i);
//         }
//         if(minus.size() == 0) {
//             for(int idx = 0; idx < nums.length; idx++)
//                 nums[idx] *= nums[idx];
//             return nums;
//         } else {
//             int[] result = new int[nums.length];
//             int idx = 0, i = 0, j = 0;
//             for(; i < minus.size() && j < plus.size();) {
//                 if(minus.get(i) < plus.get(j))  {
//                     result[idx++] = minus.get(i);
//                     i++;
//                 }
//                 else {
//                     result[idx++] = plus.get(j);
//                     j++;
//                 }
//             }
//             if(i < minus.size()) {
//                 for(; i < minus.size(); i++)
//                     result[idx++] = minus.get(i);
//             }
//             else if(j < plus.size()) {
//                 for(; j < plus.size(); j++)
//                     result[idx++] = plus.get(j);
//             }
//             return result;
//         }
//     }
// }