class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a' + 1;
            if(temp < 10)
                ans += temp;
            else
                ans += temp / 10 + temp % 10;
        }
        
        while(k > 1) {
            k--;
            s = Integer.toString(ans);
            ans = sumOfDigits(s);
        }
        return ans;
    }
    
    public int sumOfDigits(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            ans += s.charAt(i) - '0';
        }
        return ans;
    }
}