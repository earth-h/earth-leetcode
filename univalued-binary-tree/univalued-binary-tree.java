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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        
        if(root.left != null && root.left.val != root.val)
            return false;
        if(root.right != null && root.right.val != root.val)
            return false;
        
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

}
// class Solution {
//     boolean isUnival = true;
    
//     public boolean isUnivalTree(TreeNode root) {
//         dfs(root, root.val);
//         return isUnival;
//     }
    
//     public void dfs(TreeNode node, int rootValue) {
//         if(node.val == rootValue && isUnival) {
//             if(node.left != null)
//                 dfs(node.left, rootValue);
//             if(node.right != null) 
//                 dfs(node.right, rootValue);
//         }
//         else
//             isUnival = false;
//     }
// }