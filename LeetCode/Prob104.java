// Solution to problem number 104 of Leetcode

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
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }
}