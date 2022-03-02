class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int n: nums) {
            if(n < 0) neg++;
            else if(n == 0) return 0;
        }
        if(neg % 2 == 0) return 1;
        return -1;
    }
}