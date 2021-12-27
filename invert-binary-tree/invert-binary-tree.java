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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        dfs(root);
        return root;
    }
    
    public void dfs(TreeNode node) {
        if(node == null) return;
        TreeNode tmpNode = node.left;
        node.left = node.right;
        node.right = tmpNode;
        dfs(node.left);
        dfs(node.right);
    }
}