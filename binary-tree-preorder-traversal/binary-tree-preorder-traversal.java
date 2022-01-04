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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        
        if(root == null) return preOrderList;
        
        preOrder(root, preOrderList);
        
        return preOrderList;
    }
    public void preOrder(TreeNode node, List<Integer> preOrderList) {
        preOrderList.add(node.val);
        if(node.left != null) preOrder(node.left, preOrderList);
        if(node.right != null) preOrder(node.right, preOrderList);
    }
}