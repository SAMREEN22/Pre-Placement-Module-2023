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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        Stack<TreeNode> tempStack=new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            List<Integer> list=new LinkedList<>();  
            while(!stack.empty()) {
                TreeNode temp=stack.pop();
                if(temp!=null) {
                    list.add(temp.val);
                    tempStack.push(temp.left);
                    tempStack.push(temp.right);
                }
            }
            if(!tempStack.empty()) {
                result.add(list);
            }
            while(!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
        }
        return result;
    }
}
