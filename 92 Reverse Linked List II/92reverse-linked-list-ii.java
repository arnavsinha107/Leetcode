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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        int i=1;
        while(i<left){
            prev=prev.next;
            i++;
        }
        ListNode curr=prev.next;
        i=0;
        while(i<right-left){
            ListNode temp=curr.next;
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
            i++;
        }
        return dummy.next;
    }
}