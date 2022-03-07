class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int idx = 0;
        for(String str: sentence.split(" ")) {
            idx++;
            int len = searchWord.length();
            if(str.length() >= len && str.substring(0, len).equals(searchWord))
                return idx;
        }
        return -1;
    }
}