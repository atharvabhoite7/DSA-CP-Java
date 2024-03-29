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
    // int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);

    }

    public int helper(TreeNode root, int min, int max) {
        if (root == null)
            return Math.abs(max - min);

        min = Math.min(root.val, min);
        max = Math.max(root.val, max);

        int left = helper(root.left, min, max);
        int right = helper(root.right, min, max);

        return Math.max(left, right);

    }
}