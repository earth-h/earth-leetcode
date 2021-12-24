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
    int result = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        dfs(0, root);
        return result;
    }
    
    public void dfs(int val, TreeNode root) {
        if(root == null) 
            return;
        val = val * 2 + root.val;
        if(root.left == null && root.right == null) result += val;
        dfs(val, root.left);
        dfs(val, root.right);
    }
}