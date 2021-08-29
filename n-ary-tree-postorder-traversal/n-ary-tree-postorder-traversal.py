"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    '''
    ans = []
    def postorder(self, root: 'Node') -> List[int]:
        global ans
        ans = []
        self.postorderSolution(root)
        return ans
        
    def postorderSolution(self, root: 'Node') -> List[int]:
        if root:
            global ans
            for child in root.children:
                self.postorderSolution(child)
            ans.append(root.val)
    '''
    def postorder(self, root: 'Node') -> List[int]:
        return self.postorderSolution(root, [])
    
    def postorderSolution(self, root: 'Node', ans: List[int]) -> List[int]:
        if root:
            for child in root.children:
                ans = self.postorderSolution(child, ans)
            ans.append(root.val)
            return ans