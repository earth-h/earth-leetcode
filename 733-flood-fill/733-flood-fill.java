class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image; // (sr,sc) 위치와 인접한 곳에 image[sr][sc]와 동일한 color일 때 그들도 newColor로 바꿔야 하는데, 이미 동일하기 때문에 바로 return  
     
        //boolean[][] visited = new boolean[image.length][image[0].length]; // visited가 필요없는 이유는, 어짜피 동일한 color여서 newColor로 칠한 곳 다시 가면 startColor와 다른 색상이라 다시 진행 못함
        dfs(image, sr, sc, newColor, image[sr][sc]);
        
        return image;
    }
    public void dfs(int[][] image,int sr, int sc, int newColor, int startColor) {
        //visited[sr][sc] = true;
        if(image[sr][sc] == startColor) {
            image[sr][sc] = newColor;
            if(sr - 1 >= 0) dfs(image, sr - 1, sc, newColor, startColor);
            if(sc - 1 >= 0) dfs(image, sr, sc - 1, newColor, startColor);
            if(sr + 1 < image.length) dfs(image, sr + 1, sc, newColor, startColor);
            if(sc + 1 < image[0].length) dfs(image, sr, sc + 1, newColor, startColor);
        }
    }
}