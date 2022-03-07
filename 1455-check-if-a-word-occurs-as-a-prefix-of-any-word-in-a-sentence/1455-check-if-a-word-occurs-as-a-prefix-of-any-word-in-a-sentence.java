class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int idx = 0;
        for(String str: sentence.split(" ")) {
            idx++;
            if(str.length() >= searchWord.length() && str.substring(0, searchWord.length()).equals(searchWord))
                return idx;
        }
        return -1;
    }
}