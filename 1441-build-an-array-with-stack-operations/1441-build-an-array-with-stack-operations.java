class Solution {
    public List<String> buildArray(int[] target, int n) {
        int idx = 0;
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(target[idx] == i) {
                result.add("Push");
                idx++;
            }
            else {
                result.add("Push");
                result.add("Pop");
            }
            if(idx == target.length) break;
        }
        return result;
    }
}