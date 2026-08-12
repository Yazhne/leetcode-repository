// Last updated: 8/12/2026, 10:21:27 PM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        else if(val > root.val) {
            return searchBST(root.right, val);
        }
        else if(val < root.val) {
            return searchBST(root.left, val);
        }
        return root;
    }
}