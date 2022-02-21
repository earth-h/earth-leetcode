// class Solution {
//     public int countGoodSubstrings(String s) {
//         if(s.length() < 3) return 0;
//         int a = s.charAt(0), b = s.charAt(1), c = s.charAt(2), result = (a != b && b != c && c != a) ? 1 : 0;
//         for(int i = 3; i < s.length(); i++) {
//             a = b;
//             b = c;
//             c = s.charAt(i);
//             if(a != b && b != c && c != a) result++;
//         }
//         return result;
//     }
// }
class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int result = (s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) && s.charAt(2) != s.charAt(0)) ? 1 : 0;
        for(int i = 1; i < s.length() - 2; i++) {
            if(s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i + 2) != s.charAt(i)) result++;
        }
        return result;
    }
}