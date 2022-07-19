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
    public static int size(ListNode l1){
        ListNode temp=l1;
        int c=0 ;
        while(temp!=null){
            temp=temp.next;
            c+=1;
        }
        return c;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {  
        ListNode tail1=l1,tail2=l2;
        while(tail1.next!=null){
            tail1=tail1.next;
        }
        while(tail2.next!=null){
            tail2=tail2.next;
        }
        int c1=0,c2=0;
        c1=size(l1);
        c2=size(l2);
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0,sum;
        if(c1>=c2){
            while(temp1!=null && temp2!=null){
                sum=temp1.val+temp2.val+carry;
                carry=sum/10;
                sum=sum%10;
                temp1.val=sum;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while(temp1!=null)
            {
                sum=temp1.val+carry;
                carry=sum/10;
                sum=sum%10;
                temp1.val=sum;
                temp1=temp1.next;
            }
            if(carry!=0){
               ListNode l3=new ListNode(carry);
               tail1.next=l3;
                l3.next=null; 
            }
            return l1;
        }
        else{
            while(temp1!=null && temp2!=null){
            sum=temp1.val+temp2.val+carry; 
                carry=sum/10;
                sum=sum%10;
                temp2.val=sum;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while(temp2!=null){
                sum=temp2.val+carry;
                carry=sum/10;
                sum=sum%10;
                temp2.val=sum;
                temp2=temp2.next;
            }
            if(carry!=0){
                ListNode l3=new ListNode(carry);
                tail2.next=l3;
                l3.next=null; 
            }
            return l2;   
        }     
    }
}
