# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pushleft(self,node,stack):
        while node:
            stack.append(node)
            node=node.left
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        stack=[]
        self.pushleft(root,stack)
        while len(stack)!=0:
            top=stack.pop()
            ans.append(top.val)
            self.pushleft(top.right,stack)
        return ans
