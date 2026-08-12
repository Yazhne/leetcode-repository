// Last updated: 8/12/2026, 10:26:24 PM
import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }
    
    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfs(node.left, result);       
        dfs(node.right, result);      
        result.add(node.val);         
    }
}