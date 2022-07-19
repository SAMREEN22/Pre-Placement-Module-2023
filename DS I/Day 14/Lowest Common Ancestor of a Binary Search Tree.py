# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        if p.val>q.val:
            p,q=q,p
        
        currentNode=root
        while currentNode:
            if p.val<=currentNode.val:
                if currentNode.val<=q.val:
                    return currentNode
                else:
                    currentNode=currentNode.left
            else:
                currentNode=currentNode.right
        
