# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: TreeNode, low: int, high: int) -> int:
        
        result = 0
        
        queue = deque()
        queue.append(root)
        
        while queue:
            node = queue.popleft()
            if node.val >= low and node.val <= high:
                result += node.val
                if node.left is not None:
                    queue.append(node.left)
                if node.right is not None:
                    queue.append(node.right)
            elif node.val < low and node.right is not None:
                queue.append(node.right)
            elif node.val > high and node.left is not None:
                queue.append(node.left)

        return result