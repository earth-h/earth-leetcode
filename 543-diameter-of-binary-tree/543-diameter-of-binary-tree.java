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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int max = checkDiameterOfBinaryTree(root);
        
        Stack<TreeNode> stack = new Stack<>();
        if(root.left != null) stack.push(root.left);
        if(root.right != null) stack.push(root.right);
        
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left == null || node.right == null) continue;
            stack.add(node.left);
            stack.add(node.right);
            int tmp = checkDiameterOfBinaryTree(node);
            max = tmp > max ? tmp : max;
        }
        
        return max;
    }
    
    public int checkDiameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        
        if(root.left != null) left.add(root.left);
        if(root.right != null) right.add(root.right);
        
        int leftDepth = 0;
        int rightDepth = 0;
        
        while(!left.isEmpty()) {
            int len = left.size();
            leftDepth++;
            for(int i = 0; i < len; i++) {
                TreeNode node = left.poll();
                if(node.left != null) left.add(node.left);
                if(node.right != null) left.add(node.right);
            }
        }
        while(!right.isEmpty()) {
            int len = right.size();
            rightDepth++;
            for(int i = 0; i < len; i++) {
                TreeNode node = right.poll();
                if(node.left != null) right.add(node.left);
                if(node.right != null) right.add(node.right);
            }
        }
        return leftDepth + rightDepth;
    }
}