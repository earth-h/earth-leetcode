class Solution {
    public int singleNumber(int[] nums) {
        // 0 XOR N = N
        // N XOR N = 0
        // X1 XOR X1 XOR X2 XOR X2 XOR X3 XOR X3 XOR X4 = 0 XOR X4 = X4
        int result = 0;
        for(int num: nums) {
            result ^= num;
        }
        return result;
    }
}