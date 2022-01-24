/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<TreeNode, Integer> map = new HashMap<>();
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        map.put(root, 1);
        
        int xDepth = 0;
        int yDepth = 0;
        
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            int depth = map.get(node);

            if(node.left != null && node.right != null) {
                if((x == node.left.val && y == node.right.val) || (y == node.left.val && x == node.right.val)) return false;
            }
            
            if(node.left != null) {
                stack.push(node.left);
                map.put(node.left, depth + 1);
                if(x == node.left.val) xDepth = depth + 1;
                if(y == node.left.val) yDepth = depth + 1;
            }
            if(node.right != null) {
                stack.push(node.right);
                map.put(node.right, depth + 1);
                if(x == node.right.val) xDepth = depth + 1;
                if(y == node.right.val) yDepth = depth + 1;
            }
            
            if(xDepth != 0 && yDepth != 0) {
                if(xDepth == yDepth) return true;
                else return false;
            }
        }
        
        return false;
    }
}