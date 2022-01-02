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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf = new ArrayList<>();
        leafDfs(root1, leaf);
        
        System.out.println("leaf: " + leaf);
        
        if(root1 != null && root2 == null) return false;
        else if(root1 == null && root2 == null) return true;
        
        return dfs(root2, leaf) && leaf.size() == 0;
        
    }
    
    public void leafDfs(TreeNode node, List<Integer> leaf) {
        if(node == null) return;
        
        if(node.left == null && node.right == null) {
            leaf.add(node.val);
        }
        else {
            leafDfs(node.left, leaf);
            leafDfs(node.right, leaf);
        }
    }
    
    public boolean dfs(TreeNode node, List<Integer> leaf) {
        if(node.left == null && node.right == null) {
            if(leaf.size() == 0) return false;
            int leafVal = leaf.get(0);
            leaf.remove(0);
            if(node.val != leafVal) return false;
            else return true;
        }
        else if(node.left == null)
            return dfs(node.right, leaf);
        else if(node.right == null)
            return dfs(node.left, leaf);
        else {
            return dfs(node.left, leaf) && dfs(node.right, leaf);
        }
    }
}