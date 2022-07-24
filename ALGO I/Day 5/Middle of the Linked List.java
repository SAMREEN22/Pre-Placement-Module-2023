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
    public ListNode middleNode(ListNode head) {
        int count=1;
        int middle=0;
        ListNode copyNode=head;;
        while(head.next!=null){
            head=head.next;
            count++;
        }
        if(count%2!=0){
            middle=((count-1)/2)+1;
        }
        else{
             middle=(count/2)+1;
        }
        count=1;
        ListNode  middleNode=null;
        while(count!=middle){
            copyNode=copyNode.next;
            count++;
        }
        return copyNode;
    }
}
