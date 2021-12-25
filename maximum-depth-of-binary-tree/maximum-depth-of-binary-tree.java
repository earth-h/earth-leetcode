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
    int maxDepth = 1;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(1, root);
        return maxDepth;
    }
    
    public void dfs(int val, TreeNode root) {
        if(root == null) return;
        if(root.left != null || root.right != null) maxDepth = maxDepth > val + 1 ? maxDepth : val + 1;
        dfs(val + 1, root.left);
        dfs(val + 1, root.right);
    }
}