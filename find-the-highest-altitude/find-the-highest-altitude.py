class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        # 0 to n path
        # gain[0] = 0 -> 1 path (path[0] = 0)
        # gain[1] = 1 -> 2 path (path[1] = path[0] + gain[0])
        # gain[n] = n -> n + 1 path (path[n] = path[n - 1] + gain[n - 1])
        
        path = [0]
        
        for i in gain:
            path.append(path[-1] + i)
            
        return max(path)