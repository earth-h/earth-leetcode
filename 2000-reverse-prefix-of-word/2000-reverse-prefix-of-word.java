class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chArray = word.toCharArray();
        int idx = -1;
        for(int i = 0; i < chArray.length; i++) {
            if(ch == chArray[i]) {
                idx = i;
                break;
            }
        }
        if(idx == -1) return word;
        else {
            for(int i = 0; i <= idx / 2; i++) {
                char tmp = chArray[i];
                chArray[i] = chArray[idx - i];
                chArray[idx - i] = tmp;
            }
        }
        return String.valueOf(chArray);
    }
}
// class Solution {
//     public String reversePrefix(String word, char ch) {
//         String charWord = Character.toString(ch);
//         String[] wordArray = word.split(charWord, 2);
        
//         if(wordArray.length == 1 && word.substring(word.length() - 1) != charWord)
//             return word;
        
//         StringBuffer sb = new StringBuffer(wordArray[0].concat(charWord));
        
//         if(wordArray.length == 2)
//             return sb.reverse().toString() + wordArray[1];
//         return sb.reverse().toString();
//     }
// }