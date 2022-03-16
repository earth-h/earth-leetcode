class Solution {
    public int maxPower(String s) {
        int result = 0, tempResult = 1;
        char c = s.charAt(0);
        if(s.length() == 1) return 1;
        for(int i = 1; i < s.length(); i++) {
            if(c == s.charAt(i)) {
                tempResult++;
            } else {
                result = result > tempResult ? result : tempResult;
                tempResult = 1;
                c = s.charAt(i);
            } 
        }
        result =  result > tempResult ? result : tempResult;
        return result;
    }
}