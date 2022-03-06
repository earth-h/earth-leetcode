class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] result = new String[size];
        
        for(int idx = 0; idx < size; idx++) {
            result[idx] = "";
            if(idx != size - 1) {
                for(int i = 0; i < k; i++) 
                    result[idx] += s.charAt(idx * k + i);
            }
            else {
                for(int i = 0; i < k - (idx * k + k - s.length()); i++) 
                    result[idx] += s.charAt(idx * k + i);
                for(int i = 0; i < idx * k + k - s.length(); i++)
                    result[idx] += fill;
            }
        }
        
        return result;
    }
}