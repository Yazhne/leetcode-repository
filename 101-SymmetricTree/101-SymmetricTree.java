// Last updated: 8/12/2026, 10:27:11 PM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            return leftNode == rightNode;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        return isMirror(leftNode.left, rightNode.right) &&
               isMirror(leftNode.right, rightNode.left);
    }
}
 
