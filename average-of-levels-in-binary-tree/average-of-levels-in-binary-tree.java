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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgSum = new ArrayList<>();
        if(root == null) return avgSum;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            Double nodeSum = 0.0; // int로 만든 후, 나눌 때 * 1.0을 하게 되면, node.val이 2^31-1이고, 여러 원소를 더해야할 경우 int 최대값을 넘어 원하지 않는 결과가 나올 수 있음
            for(int i = 0; i < queueSize; i++) {
                TreeNode curNode = queue.poll();
                nodeSum += curNode.val;
                if (curNode.left != null) queue.add(curNode.left);
                if (curNode.right != null) queue.add(curNode.right);
            }
            avgSum.add(nodeSum / queueSize);
        }
        return avgSum;
    }
}