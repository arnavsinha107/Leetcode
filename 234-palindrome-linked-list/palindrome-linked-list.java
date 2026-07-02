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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        ListNode temp=head;
        while(temp!=null){
            tail.next=new ListNode(temp.val);
            tail=tail.next;
            temp=temp.next;
        }
        ListNode copy=dummy.next;
        
        ListNode prev=null;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(prev.next!=null){
            if(prev.val!=copy.val){
                return false;
            }
            //System.out.print(copy.val+" ");
            prev=prev.next;
            copy=copy.next;
        }
        return true;

        

    }
}