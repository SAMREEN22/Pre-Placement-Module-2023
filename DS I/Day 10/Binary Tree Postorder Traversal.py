# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        traversal,stack=[],[root]
        while stack:
            node=stack.pop()
            if node:
                traversal.append(node.val)
                stack.append(node.left)
                stack.append(node.right)
        return traversal[::-1]
