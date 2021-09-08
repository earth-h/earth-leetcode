# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        queue = deque([root])
        
        while queue:
            curNode = queue.popleft()
            if curNode.val == val:
                return curNode
            if curNode.left != None:
                queue.append(curNode.left)
            if curNode.right != None:
                queue.append(curNode.right)
        return None
        