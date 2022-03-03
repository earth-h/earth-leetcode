class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                double res = Math.sqrt(i * i + j * j);
                if(res == Math.floor(res) && res <= n)
                    ans++;
            }
        }
        return ans;
    }
}