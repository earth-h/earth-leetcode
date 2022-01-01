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
    public boolean findTarget(TreeNode root, int k) {
        boolean isEqual = false;
        
        if(root == null) return false;
    
        // a + b = k인데, a가 k보다 커도 b가 음수이면 가능할 수 있음
        // if(root.val > k) {
        //     return findTarget(root.left, k);
        // }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(isEqual == false && !queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            if(curNode == null) continue;
            queue.add(curNode.right);
            queue.add(curNode.left);
            if(curNode.val != k - curNode.val)
                isEqual = findTargetEqual(root.left, k - curNode.val) || findTargetEqual(root.right, k - curNode.val) ? true : false;
        }
        
        return isEqual;
    }
    
    public boolean findTargetEqual(TreeNode root, int k) {
        if(root == null) return false;
        if(root.val == k) return true;
        else if(root.val > k) return findTargetEqual(root.left, k);
        else {
            return findTargetEqual(root.left, k) || findTargetEqual(root.right, k) ? true : false;
        }
    }
}