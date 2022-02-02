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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        int[] sum = new int[] {0};
        
        hasPath(root, targetSum, sum, 0);
        
        return sum[0] == 1 ? true: false;
    }
    
    public void hasPath(TreeNode node, int targetSum, int[] sum, int curSum) {
        if(sum[0] == 1) return;
        
        curSum += node.val;
        
        if(node.left != null) 
            hasPath(node.left, targetSum, sum, curSum);
        if(node.right != null)
            hasPath(node.right, targetSum, sum, curSum);
        if(node.left == null && node.right == null && curSum == targetSum)
            sum[0] = 1;
    }
}