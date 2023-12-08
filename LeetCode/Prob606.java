/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    StringBuilder str = new StringBuilder();

    public String tree2str(TreeNode root) {
        preorder(root);
        return str.toString();
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        str.append(root.val + "");

        if (root.left != null) {
            str.append('(');
            preorder(root.left);
            str.append(')');
        }

        if (root.left == null && root.right != null) {
            str.append("()");
        }

        if (root.right != null) {
            str.append('(');
            preorder(root.right);
            str.append(')');
        }
    }
}
