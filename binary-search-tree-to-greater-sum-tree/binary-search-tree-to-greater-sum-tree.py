# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        def in_order_traversal(node: TreeNode, greaterSum: int) -> int:
            if node is None:
                return greaterSum
            greaterSum = in_order_traversal(node.right, greaterSum) # right
            curNode = node.val # tmp variable(current node value)
            node.val += greaterSum
            greaterSum += curNode
            greaterSum = in_order_traversal(node.left, greaterSum) # left
            return greaterSum
            
        in_order_traversal(root, 0)
     
        return root