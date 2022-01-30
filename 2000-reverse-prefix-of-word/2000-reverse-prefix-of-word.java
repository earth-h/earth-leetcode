class Solution {
    public String reversePrefix(String word, char ch) {
        String charWord = Character.toString(ch);
        String[] wordArray = word.split(charWord, 2);
        
        if(wordArray.length == 1 && word.substring(word.length() - 1) != charWord)
            return word;
        
        StringBuffer sb = new StringBuffer(wordArray[0].concat(charWord));
        
        if(wordArray.length == 2)
            return sb.reverse().toString() + wordArray[1];
        return sb.reverse().toString();
    }
}