class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String word: words1) {
            if(map1.containsKey(word)) 
                map1.put(word, map1.get(word) + 1);
            else
                map1.put(word, 1);
        }
        for(String word: words2) {
            if(map1.containsKey(word) && map1.get(word) == 1) {
                if(map2.containsKey(word)) {
                    map1.remove(word);
                    map2.remove(word);
                }
                else
                    map2.put(word, 1);
            }
        }
        return map2.size();
    }
}