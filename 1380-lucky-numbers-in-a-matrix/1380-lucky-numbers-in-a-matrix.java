class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int[] minRowVal = new int[matrix.length];
        int[] maxColVal = new int[matrix[0].length];
        
        int idx = 0;
        
        for(int[] mat: matrix) {
            for(int i = 0; i < mat.length; i++) {
                maxColVal[i] = maxColVal[i] < mat[i] ? mat[i] : maxColVal[i];
                minRowVal[idx] = minRowVal[idx] == 0 || minRowVal[idx] > mat[i] ? mat[i] : minRowVal[idx];
            }
            idx++;
        }
        
        for(int i : minRowVal) {
            for(int j : maxColVal) 
                if(i == j) {
                    result.add(i);
                    break;
                }
        }
        
        return result;
    }
}