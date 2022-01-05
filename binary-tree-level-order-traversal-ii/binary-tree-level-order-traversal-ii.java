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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;
        
        dfs(root, 0, result);
        
        return result;
        
    }
    
    public void dfs(TreeNode node, int level, List<List<Integer>> result) {
        if(node == null) return;
        if(result.size() == level) {
            result.add(0, new ArrayList<>());
        }
        result.get(result.size() - level - 1).add(node.val);
        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
    }
}