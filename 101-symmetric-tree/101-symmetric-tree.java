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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricCheck(root.left, root.right);
    }
    
    public boolean isSymmetricCheck(TreeNode node1, TreeNode node2) {
        if(node1 == null || node2 == null) 
            return node1 == node2; // node1와 node2 중 하나만 null이면 false일 것이고, 둘 다 null이면 true
        if(node1.val != node2.val) 
            return false;
        return isSymmetricCheck(node1.left, node2.right) && isSymmetricCheck(node1.right, node2.left);
    }
}
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
     
//         if(root.left == null ^ root.right == null) return false;
//         if(root.left == null && root.right == null) return true;
        
//         Queue<TreeNode> queue1 = new LinkedList<>();
//         Queue<TreeNode> queue2 = new LinkedList<>();
        
//         queue1.add(root.left);
//         queue2.add(root.right);
        
//         while(!queue1.isEmpty() && !queue2.isEmpty()) {
//             TreeNode node1 = queue1.poll();
//             TreeNode node2 = queue2.poll();
            
//             if(node1 == null ^ node2 == null) return false;
//             if(node1 == null && node2 == null) continue;
            
//             if(node1.val == node2.val) {
//                 queue1.add(node1.left);
//                 queue2.add(node2.right);
//                 queue1.add(node1.right);
//                 queue2.add(node2.left);
//             } else {
//                 return false;
//             }
//         }
//         if(queue1.isEmpty() ^ queue2.isEmpty()) return false;
//         return true;
//     }
// }