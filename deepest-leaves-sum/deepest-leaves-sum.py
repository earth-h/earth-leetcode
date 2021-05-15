# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root: TreeNode, currentDepth, depth: List):
        if root.left is None and root.right is None:
            depth[currentDepth] += root.val
            return
        
        if root.left is not None:
            self.dfs(root.left, currentDepth+1, depth)
        if root.right is not None:
            self.dfs(root.right, currentDepth+1, depth)

    
    def deepestLeavesSum(self, root: TreeNode) -> int:
        depth = [0 for _ in range(10000)] # 1 <= node count <= 10000
        currentDepth = 0
        
        self.dfs(root, 0, depth)
        
        for i in range(10000):
            if depth[10000 - i - 1] == 0:
                continue
            else:
                return depth[10000 - i -1]