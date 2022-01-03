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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        
        postOrder(root, postOrderList);
        
        return postOrderList;
    }
    public void postOrder(TreeNode node, List<Integer> postOrderList) {
        if(node == null) return;
        
        postOrder(node.left, postOrderList);
        postOrder(node.right, postOrderList);
        postOrderList.add(node.val);
    }
}