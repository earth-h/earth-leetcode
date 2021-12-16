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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();
        int result = 0;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.val >= low && node.val <= high) {
                result += node.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            } else if(node.val < low) {
                if(node.right != null)
                    queue.offer(node.right);
            } else if(node.val > high) {
                if(node.left != null)
                    queue.offer(node.left);
            }
        }
        return result;
    }
}