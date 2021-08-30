"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        def preorderSolution(root: 'Node'):
            if root:
                ans.append(root.val)
                for child in root.children:
                    preorderSolution(child)
        ans = []
        preorderSolution(root)
        return ans