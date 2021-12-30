class Solution {
    public int islandPerimeter(int[][] grid) {
        // 자식이 오른쪽이랑 아래라고 생각 (1,0), (0,1) 방향으로 진행하면 될 듯 함
        // 오른쪽이나 아래가 0이면, 각각 + 1
        // 자신의 위(0, -1)가 0이거나, 위가 없으면 + 1 
        // 자신의 왼쪽(-1,0)이 0이거나 왼쪽이 없다면 + 1
        int[] x = {0, 0, 1, -1};
        int[] y = {1, -1, 0, 0};
        int total = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    total = j == grid[0].length - 1 || i + x[0] >= 0 && j + y[0] >= 0 && i + x[0] < grid.length && j + y[0] < grid[0].length && grid[i + x[0]][j + y[0]] == 0 ? total + 1 : total;
                    total = j == 0 || i + x[1] >= 0 && j + y[1] >= 0 && i + x[1] < grid.length && j + y[1] < grid[0].length && grid[i + x[1]][j + y[1]] == 0 ? total + 1 : total;
                    total = i == grid.length - 1 || i + x[2] >= 0 && j + y[2] >= 0 && i + x[2] < grid.length && j + y[2] < grid[0].length && grid[i + x[2]][j + y[2]] == 0 ? total + 1 : total;
                    total = i == 0 || i + x[3] >= 0 && j + y[3] >= 0 && i + x[3] < grid.length && j + y[3] < grid[0].length && grid[i + x[3]][j + y[3]] == 0 ? total + 1 : total;
                }
            }
        }
        return total;
    }
}