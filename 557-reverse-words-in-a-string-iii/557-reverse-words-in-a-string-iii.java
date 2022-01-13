class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int start = 0, end = 0;
        for(char c: charArray) {
            if(c == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverse(charArray, start, end - 1);
        return new String(charArray);
    }
    
    public void reverse(char[] charArray, int start, int end) {
        while(start < end) {
            char a = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = a;
            start++;
            end--;
        }
    }
}