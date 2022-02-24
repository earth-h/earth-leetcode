// class Solution {
//     public List<String> commonChars(String[] words) {
//         List<Map<Character, Integer>> mapList = new ArrayList<>();
//         List<String> result = new ArrayList<>();
//         for(String word: words) {
//             Map<Character, Integer> map = new HashMap<>();
//             for(int i = 0; i < word.length(); i++) {
//                 char curChar = word.charAt(i);
//                 if(map.containsKey(curChar)) {
//                     map.put(curChar, map.get(curChar) + 1);
//                 } else {
//                     map.put(curChar, 1);
//                 }
//             }
//             mapList.add(map);
//         }
//         Map<Character, Integer> curMap = mapList.get(0);
//         for(char curKey: curMap.keySet()) {
//             int hasKeyCnt = curMap.get(curKey);
//             for(Map<Character, Integer> map: mapList) {
//                 if(!map.containsKey(curKey)) {
//                     hasKeyCnt = 0;
//                     break;
//                 }
//                 if(map.get(curKey) < hasKeyCnt) {
//                     hasKeyCnt = map.get(curKey);
//                 }
//             }
//             for(int i = 0; i < hasKeyCnt; i++) {
//                 result.add(Character.toString(curKey));
//             }
//         }   
//         return result;
//     }
// }
class Solution {
    public List<String> commonChars(String[] words) {
        int[] alpha = new int[26];
        Arrays.fill(alpha, Integer.MAX_VALUE);
        List<String> result = new ArrayList<>();

        for(String word: words) {
            int[] tempAlpha = new int[26];
            for(int i = 0; i < word.length(); i++) {
                int curChar = word.charAt(i) - 'a';
                tempAlpha[curChar] += 1;
            }
            for(int i = 0; i < 26; i++) {
                if(alpha[i] > tempAlpha[i]) alpha[i] = tempAlpha[i];
            }
        }
        
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < alpha[i]; j++) {
                char curChar = (char)('a' + i);
                result.add(Character.toString(curChar));
            }
        }
        return result;
    }
}