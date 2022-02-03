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
    public int minDepth(TreeNode root) {
        if(root == null) return 0; 
        
        int[] result = new int[] {100002}; // 한쪽으로 비대칭 트리일 수 있으므로
        
        dfs(root, result, 1);
        
        return result[0];
    }
    public void dfs(TreeNode node, int[] result, int curDepth) {
        if(curDepth >= result[0]) return;
        
        if(node.left != null) dfs(node.left, result, curDepth + 1);
        if(node.right != null) dfs(node.right, result, curDepth + 1);
        
        if(node.left == null && node.right == null) 
            result[0] = result[0] > curDepth ? curDepth : result[0];
    }
}