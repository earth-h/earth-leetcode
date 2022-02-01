class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination && source < n) return true;
        int[] visited = new int[n];
        visited[source] = 1;
        
        // edges > map
        Map<Integer, List<Integer>> edgeMap = new HashMap<>();
        for(int i = 0; i < n; i++) 
            edgeMap.put(i, new ArrayList<>());
        
        for(int[] edge: edges) {
            edgeMap.get(edge[0]).add(edge[1]);
            edgeMap.get(edge[1]).add(edge[0]);
        }
        
        return dfs(edgeMap, visited, source, destination);
    }
    
    public boolean dfs(Map<Integer, List<Integer>> edgeMap, int[] visited, int source, int destination) {
        for(int next: edgeMap.get(source)) {
            if(visited[next] == 0) {
                visited[next] = 1;
                if(next == destination) return true;
                if(dfs(edgeMap, visited, next, destination) == true) return true;
                else continue;
            }
        }
        return false;
    }
}