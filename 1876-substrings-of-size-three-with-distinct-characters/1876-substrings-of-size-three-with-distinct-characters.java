class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int a = s.charAt(0), b = s.charAt(1), c = s.charAt(2), result = (a != b && b != c && c != a) ? 1 : 0;
        for(int i = 3; i < s.length(); i++) {
            a = b;
            b = c;
            c = s.charAt(i);
            if(a != b && b != c && c != a) result++;
        }
        return result;
    }
}