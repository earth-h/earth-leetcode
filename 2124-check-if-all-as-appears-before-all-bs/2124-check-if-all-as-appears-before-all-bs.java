class Solution {
    public boolean checkString(String s) {
        for(int idx = 1; idx < s.length(); idx++) {
            if(s.charAt(idx - 1) == 'b' && s.charAt(idx) == 'a') 
                return false;
        }
        return true;
    }
}
// class Solution {
//     public boolean checkString(String s) {
//         int b = 0;
        
//         for(String a: s.split("")) {
//             if(b == 1 && a.compareTo("a") == 0) return false;
//             if(a.compareTo("b") == 0) {
//                 b = 1;
//             }
//         }
//         return true;
//     }
// }