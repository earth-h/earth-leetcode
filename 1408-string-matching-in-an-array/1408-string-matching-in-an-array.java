class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(String word: words) {
            for(String w: words) {
                if(!word.equals(w) && w.contains(word)) {
                    result.add(word);
                    break;
                }
            }
        }
        return result;
    }
}