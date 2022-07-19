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
    
    public boolean helper(TreeNode node, int k, HashSet<Integer> set) {
        if(node==null) {
            return false;       
        }
        if(set.contains(k-node.val)) {
            return true;
        }
        else {
            set.add(node.val);
        }
        
        boolean lans=helper(node.left, k, set);
        if(lans)
            return true;
        boolean rans=helper(node.right, k, set);
        if(rans)
            return true;
        return false;
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set=new HashSet<>();
        return helper(root, k, set);
    }
}
