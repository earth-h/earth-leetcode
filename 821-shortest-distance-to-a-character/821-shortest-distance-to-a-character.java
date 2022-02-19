class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> location = new ArrayList<>();
        int[] result = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                location.add(i);
        }
        
        int idx = 0, locateLen = location.size();
        
        for(int i = 0; i < s.length(); i++) {
            if(location.get(idx) >= i)
                result[i] = location.get(idx) - i;
            else if(locateLen - 1 > idx) {
                if(i - location.get(idx) > location.get(idx + 1) - i) {
                    result[i] = location.get(idx + 1) - i;
                    idx++;
                }
                else
                    result[i] = i - location.get(idx);
            }
            else
                result[i] = result[i] = i - location.get(idx);
        }
        return result;
    }
}