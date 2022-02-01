class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination && source < n) return true;
        int[] visited = new int[n];
        visited[source] = 1;
        boolean[] found = new boolean[1];
        found[0] = false;
        
        // edges > map
        Map<Integer, List<Integer>> edgeMap = new HashMap<>();
        for(int i = 0; i < n; i++) 
            edgeMap.put(i, new ArrayList<>());
        
        for(int[] edge: edges) {
            edgeMap.get(edge[0]).add(edge[1]);
            edgeMap.get(edge[1]).add(edge[0]);
        }
        
        dfs(edgeMap, visited, source, destination, found);
        
        return found[0];
    }
    
    public void dfs(Map<Integer, List<Integer>> edgeMap, int[] visited, int source, int destination, boolean[] found) {
        if(found[0] == true) return;
        for(int next: edgeMap.get(source)) {
            if(visited[next] == 0) {
                if(next == destination) {
                    found[0] = true;
                    return;
                }
                else {
                    visited[next] = 1;
                    dfs(edgeMap, visited, next, destination, found);
                    if(found[0] == true) return;
                }
            }
        }
    }
}