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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            boolean xExist = false;
            boolean yExist = false;
            int queueLen = queue.size();
            for(int i = 0; i < queueLen; i++) { // 존재하는 queue 내용물은 모두 같은 depth
                TreeNode node = queue.poll(); // stack이 아닌 queue를 사용한 이유는 먼저 들어간게 나와야 이 for문에 의해 들어간 자식들 depth를 돌지 않음
                if(node.val == x) xExist = true;
                if(node.val == y) yExist = true;
                
                if(node.left != null && node.right != null) {
                    if(node.left.val == x && node.right.val == y) return false;
                    if(node.left.val == y && node.right.val == x) return false;
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(xExist && yExist) return true;
            else if(xExist ^ yExist) return false;
        }
        return false;
    }
}

// class Solution {
//     public boolean isCousins(TreeNode root, int x, int y) {
//         Map<TreeNode, Integer> map = new HashMap<>();
        
//         Stack<TreeNode> stack = new Stack<>();
//         stack.push(root);
//         map.put(root, 1);
        
//         int xDepth = 0;
//         int yDepth = 0;
        
//         while(!stack.empty()) {
//             TreeNode node = stack.pop();
//             int depth = map.get(node);

//             if(node.left != null && node.right != null) {
//                 if((x == node.left.val && y == node.right.val) || (y == node.left.val && x == node.right.val)) return false;
//             }
            
//             if(node.left != null) {
//                 stack.push(node.left);
//                 map.put(node.left, depth + 1);
//                 if(x == node.left.val) xDepth = depth + 1;
//                 if(y == node.left.val) yDepth = depth + 1;
//             }
//             if(node.right != null) {
//                 stack.push(node.right);
//                 map.put(node.right, depth + 1);
//                 if(x == node.right.val) xDepth = depth + 1;
//                 if(y == node.right.val) yDepth = depth + 1;
//             }
            
//             if(xDepth != 0 && yDepth != 0) {
//                 if(xDepth == yDepth) return true;
//                 else return false;
//             }
//         }
        
//         return false;
//     }
// }