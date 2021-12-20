class Solution {
    public List<Integer> getRow(int rowIndex) {
        // result[i][j] = result[i-1][j-1] + result[i-1][j];
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            if(i <= 1) {
                for(int j = 0; j <= i; j++)
                    row.add(1);
            } else {
                row.add(1);
                for(int j = 1; j < i; j++)
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                row.add(1);
            }
            result.add(row);
        }
        
        return result.get(rowIndex);
    }
}