class Solution {
    public boolean checkString(String s) {
        int b = 0;
        
        for(String a: s.split("")) {
            if(b == 1 && a.compareTo("a") == 0) return false;
            if(a.compareTo("b") == 0) {
                b = 1;
            }
        }
        return true;
    }
}