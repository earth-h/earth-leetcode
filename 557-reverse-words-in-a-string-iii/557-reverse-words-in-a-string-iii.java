class Solution {
    public String reverseWords(String s) {
        String result = "";
        for(String splitStr: s.split(" ")) {
            if(result != "") result += " ";
            StringBuilder sb = new StringBuilder(splitStr);
            result += sb.reverse().toString();
        }
        return result;
    }
}