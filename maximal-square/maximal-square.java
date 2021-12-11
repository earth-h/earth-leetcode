class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        char result = '0';
        for(int x = 1; x < m; x++) {
            for(int y = 1; y < n; y++) {
                if (matrix[x][y] == '0')
                    continue;

                matrix[x][y] += min(matrix[x-1][y], matrix[x-1][y-1], matrix[x][y-1]) - '0';

                if (matrix[x][y] > result)
                    result = matrix[x][y];
            }
        }
        if (result == '0') {
            for(int x = 0; x < m; x++)
                if(matrix[x][0] == '1')
                    return 1;
            for(int y = 0; y < n; y++)
                if(matrix[0][y] == '1')
                    return 1;
        }
        return (result - '0') * (result - '0');
    }
    public char min(char a, char b, char c) {
        if (a <= b && a <= c) 
            return a;
        else if (b <= a && b <= c) 
            return b;
        else
            return c;
    }
}