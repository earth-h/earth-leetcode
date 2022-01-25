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
    public int findTilt(TreeNode root) {
        int []result = new int[1];
        result[0] = 0;
        postOrder(root, result);
        return result[0];
    }
    
    public int postOrder(TreeNode node, int[] result) {
        if(node == null) return 0;
        
        
        int left = postOrder(node.left, result);
        int right = postOrder(node.right, result);
        
        result[0] += Math.abs(left - right);
        
        return left + right + node.val;
    }
}