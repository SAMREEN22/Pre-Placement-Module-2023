# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not list1:
            return list2
        if not list2:
            return list1
        res=ListNode()
        temp=res
        while list1 or list2:
            if not (list1 and list2):
                if not list1:
                    temp.next=list2
                else:
                    temp.next=list1
                break
            if list1.val<=list2.val:
                temp1=list1.next
                temp.next=list1
                list1=temp1
            else:
                temp2=list2.next
                temp.next=list2
                list2=temp2
            temp=temp.next 
        return res.next
