class Solution {
    public String reverseWords(String s) {
        String result = "";
        for(String splitStr: s.split(" ")) {
            if(result != "") result += " ";
            char[] str = splitStr.toCharArray();
            int len = str.length;
            for(int i = 0; i < len / 2; i++) {
                char c = str[i];
                str[i] = str[len - i - 1];
                str[len -i - 1] = c;
            }
            result += new String(str);
        }
        return result;
    }
}