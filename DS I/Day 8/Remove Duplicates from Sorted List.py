# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or head.next == None:
            return head
        current=previous=head
        seen=set()
        while current:            
            if current.val in seen:
                previous.next=current.next
            else:
                seen.add(current.val)
                previous=current
            current=current.next            
        return head
