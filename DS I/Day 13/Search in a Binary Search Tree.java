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
    public TreeNode searchBST(TreeNode root, int x) {
        if(root.val == x)
        {
            return root;
        }
        if(root.val>x && root.left!= null)
        {
            return searchBST(root.left,x);
        }
        if(root.val<x && root.right!= null)
        {
            return searchBST(root.right,x);
        }
        else
        {
            return null;
        }
    }
}
