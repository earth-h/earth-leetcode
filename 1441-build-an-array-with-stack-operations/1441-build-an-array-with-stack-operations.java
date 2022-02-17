class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length;
        List<String> result = new ArrayList<>();
        for(int i = 1, idx = 0; i <= n && idx < len; i++) {
            result.add("Push");
            if(target[idx] == i) 
                idx++;
            else 
                result.add("Pop");
        }
        return result;
    }
}