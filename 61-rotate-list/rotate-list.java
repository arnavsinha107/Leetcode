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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null )return null;
        int s=0;
        ListNode size=head;
        while(size!=null){
            s++;
            size=size.next;
        }
        k=k%s;
        ListNode ans=head;
        int i=0;
        
        if(head.next==null)return head;
        // if(head.next.next==null){
        //     if(k%2==0)return head;

        //     ListNode prev=null;
        //     ListNode curr=head;
            
        //     ListNode next=curr.next;
        //     prev=curr;
        //     //curr.next=prev;
        //     curr=next;
        //     return prev;

        // }
        
        while(i!=k){
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode last=temp.next;
            last.next=head;
            temp.next=null;
            if(i==(k-1)%k){
                ans=last;
            }
            head=last;
            i++;
        }
        return ans;
       
    }
}