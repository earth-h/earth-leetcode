class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        else if(n == 1) return true;
        
        while(n != 2) {
            if(n % 2 == 0) {
                n /= 2;
            }
            else 
                return false;
        }
        return true;
    }
}