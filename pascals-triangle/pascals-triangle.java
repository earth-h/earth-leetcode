class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            int num = 0;
            List<Integer> a = new ArrayList<>();
            while(num <= i) {
                int idx = result.size() - 1;
                if(num == 0 || num == i)
                    a.add(1);
                else 
                    a.add(result.get(idx).get(num-1) + result.get(idx).get(num));
                num += 1;
            }
            result.add(a);
        }
        return result;
    }
}