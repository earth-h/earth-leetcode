class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i = 1; i < n; i++) {
            for(int j = i;j < n; j++) {
                double res = Math.sqrt(i * i + j * j);
                if(res == Math.floor(res) && res <= n)
                    if(i == j) ans++;
                    else ans += 2;
            }
        }
        return ans;
    }
}