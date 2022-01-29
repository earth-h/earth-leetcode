class Solution {
    public int findGCD(int[] nums) {
        int min = 1001, max = 0;
        for(int num: nums) {
            if(num < min) 
                min = num;
            if(num > max)
                max = num;
        }
        if(max % min == 0) return min;
        for(int i = min; i > 0; i--) {
            if((max % i == 0) && (min % i == 0))
                return i;
        }
        return 1;
    }
}