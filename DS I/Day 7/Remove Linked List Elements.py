# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        if head is None:
            return head
        current=head
        previous=None
        while current:
            if current.val==val:
                if previous is None:
                    head=head.next
                else:
                    previous.next=current.next
            else:
                previous=current
            current=current.next
        return head
