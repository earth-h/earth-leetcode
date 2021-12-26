/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int maxDepth = 1;
    
    public int maxDepth(Node root) {
        if(root == null) return 0;
        dfs(1, root);
        return maxDepth;
    }
    
    public void dfs(int val, Node node) {
        if(node == null) return;
        
        if(node.children.size() > 0)
            maxDepth = maxDepth > val + 1 ? maxDepth : val + 1;
        
        for(Node childNode: node.children)
            dfs(val + 1, childNode);
    }
}