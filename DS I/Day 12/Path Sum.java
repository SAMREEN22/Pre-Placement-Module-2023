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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return helper(root, targetSum, 0);
    }
    public boolean helper(TreeNode root, int targetSum, int currSum) {
        if(root==null) return false;
        currSum=currSum+root.val;
        if(root.left==null && root.right==null && currSum==targetSum) return true;
        return helper(root.left, targetSum, currSum) || helper(root.right,targetSum,currSum);
    }
}
