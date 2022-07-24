/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode curr=head;
        ListNode temp=head;
        while (temp!=null){
            len++;
            temp=temp.next;
        }
        if (len==1){
            return null;
        }
        len=len-n;
        System.out.println(len);
        for (int i=0;i<len-1;i++){
            curr=curr.next;
        }
        if (len==0){
            head=head.next;
        }
        System.out.println(curr.val);
        if (curr.next.next==null){
            curr.next=null;
        }else{
            curr.next=curr.next.next;
        }
        return head;
    }
}
