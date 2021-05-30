class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        def dfs(nodeIdx: int, graph: List[List[int]], path: List[int], ansPath: List[List[int]]) -> List[List[int]]:
            #path.append(nodeIdx)
            if nodeIdx == len(graph) - 1:
                tmpPath = copy.deepcopy(path)
                tmpPath.append(nodeIdx)
                ansPath.append(tmpPath)
            elif graph[nodeIdx] is []:
                path = []
                return ansPath
            else:
                path.append(nodeIdx)
                for i in range(len(graph[nodeIdx])):
                    dfs(graph[nodeIdx][i], graph, path, ansPath)
                path.remove(nodeIdx)
            return ansPath
        
        ansList= []
        ansList = dfs(0, graph, [], ansList)
            
        return ansList