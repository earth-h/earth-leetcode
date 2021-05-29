# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:

            
    
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        
        def bfs(cloned: TreeNode, val: int):
            queue = deque()
            queue.append(cloned)
            while queue:
                curNode = queue.popleft()
                if curNode.val == val:
                    return curNode
                else:
                    if curNode.left is not None:
                        queue.append(curNode.left)
                    if curNode.right is not None:
                        queue.append(curNode.right)
                        
        ansNode = bfs(cloned, target.val)
        
        return ansNode
    