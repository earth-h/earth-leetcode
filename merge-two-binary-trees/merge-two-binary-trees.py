# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def mergeTrees(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:
        # BFS(breath-first search)
        if root1 == None:
            return root2
        elif root2 == None:
            return root1
        
        queue1 = deque([root1])
        queue2 = deque([root2])
        
        while queue1 and queue2:
            node1, node2 = queue1.popleft(), queue2.popleft()
            if node1 and node2:
                node1.val += node2.val
                if not node1.left  and node2.left:
                    node1.left = TreeNode(0) # node1.left는 비어있으므로 node1.val에 node2.val을 더할때 오류가 없도록 0을 넣어서 초기화함
                if not node1.right and node2.right:
                    node1.right = TreeNode(0)
                queue1.append(node1.left)
                queue1.append(node1.right)
                queue2.append(node2.left)
                queue2.append(node2.right)
        
        return root1