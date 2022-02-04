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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> nodeNum = new HashMap<>();
        
        if(root.left == null && root.right == null) return new int[] {root.val};
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        int maxCnt = 1;
        Set<Integer> maxList = new HashSet<>();
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            Integer num = nodeNum.get(node.val);
            if(num != null) {
                nodeNum.put(node.val, num + 1);
                if(maxCnt == num + 1) {
                    maxList.add(node.val);
                }
                else if(maxCnt < num + 1) {
                    maxList = new HashSet<>();
                    maxList.add(node.val);
                    maxCnt = num + 1;
                }
            }
            else {
                nodeNum.put(node.val, 1);
                if(maxCnt == 1) {
                    maxList.add(node.val);
                }
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        System.out.println("###STOP");
        return maxList.stream().mapToInt(i->i).toArray();
    }
}