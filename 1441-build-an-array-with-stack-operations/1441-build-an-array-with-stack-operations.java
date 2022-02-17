class Solution {
    public List<String> buildArray(int[] target, int n) {
        int idx = 0;
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n && idx < target.length; i++) {
            result.add("Push");
            if(target[idx] == i) 
                idx++;
            else 
                result.add("Pop");
        }
        return result;
    }
}