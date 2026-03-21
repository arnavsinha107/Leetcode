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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode slow=head;
        int iter=0;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            if(iter!=0)slow=slow.next;
            fast=fast.next.next;
            iter++;
        }
        slow.next=slow.next.next;
        
        //System.out.print(slow.val);
        return head;


    }
}