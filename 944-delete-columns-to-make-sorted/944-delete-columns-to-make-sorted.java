class Solution {
    public int minDeletionSize(String[] strs) {
        List<char[]> charStr = new ArrayList<>();
        
        int len = strs[0].length(), result = 0;
        
        for(String str: strs) {
            charStr.add(str.toCharArray());
        }
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < charStr.size() - 1; j++) {
                if(charStr.get(j)[i] > charStr.get(j + 1)[i]) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
// class Solution {
//     public int minDeletionSize(String[] strs) {
//         int result = 0;

//         for(int i = 0; i < strs[0].length(); i++) 
//             for(int j = 0; j < strs.length - 1; j++)
//                 if(strs[j].charAt(i) > strs[j + 1].charAt(i)) {
//                     result++;
//                     break;
//                 }
        
        
//         return result;
//     }
// }