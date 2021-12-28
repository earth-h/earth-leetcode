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
    boolean isUnival = true;
    
    public boolean isUnivalTree(TreeNode root) {
        dfs(root, root.val);
        return isUnival;
    }
    
    public void dfs(TreeNode node, int rootValue) {
        if(node.val == rootValue && isUnival) {
            if(node.left != null)
                dfs(node.left, rootValue);
            if(node.right != null) 
                dfs(node.right, rootValue);
        }
        else
            isUnival = false;
    }
}