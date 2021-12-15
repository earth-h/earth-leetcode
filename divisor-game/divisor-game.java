class Solution {
    public boolean divisorGame(int n) {
        while(true) {
            int beforeN = n;
            for(int x = 1; x < n; x++) {
                if(n % x == 0) {
                    n -= x;
                    break;
                }
            }
            if(beforeN == n)
                return false;
            beforeN = n;
            for(int x = 1; x < n; x++) {
                if(n % x == 0) {
                    n -= x;
                    break;
                }
            }
            if(beforeN == n)
                return true;
            beforeN = n;
        }
    }
}