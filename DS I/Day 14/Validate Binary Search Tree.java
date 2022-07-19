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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isValidBST(TreeNode node, int min, int max){
        if(node == null) return true;
        if((node.left != null && node.val <= node.left.val) || (node.right != null && node.val >= node.right.val)) return false;
        if(node.val < min || node.val > max) return false;
        return (isValidBST(node.left, min, node.val-1) && isValidBST(node.right, node.val+1, max));
    }
}
