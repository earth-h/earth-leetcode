class Solution {
    public List<String> commonChars(String[] words) {
        List<Map<Character, Integer>> mapList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(String word: words) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < word.length(); i++) {
                char curChar = word.charAt(i);
                if(map.containsKey(curChar)) {
                    map.put(curChar, map.get(curChar) + 1);
                } else {
                    map.put(curChar, 1);
                }
            }
            mapList.add(map);
        }
        Map<Character, Integer> curMap = mapList.get(0);
        for(char curKey: curMap.keySet()) {
            int hasKeyCnt = curMap.get(curKey);
            for(Map<Character, Integer> map: mapList) {
                if(!map.containsKey(curKey)) {
                    hasKeyCnt = 0;
                    break;
                }
                if(map.get(curKey) < hasKeyCnt) {
                    hasKeyCnt = map.get(curKey);
                }
            }
            for(int i = 0; i < hasKeyCnt; i++) {
                result.add(Character.toString(curKey));
            }
        }   
        return result;
    }
}