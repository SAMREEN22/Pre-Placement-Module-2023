/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode s=head;
        ListNode join=iscycle(head);
        if(join==null) return null;
        while(s!=join){
            s=s.next;
            join=join.next;
        }
        return s;
    }
    public ListNode iscycle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return s;
            }
        }
        return null;
    }
}
