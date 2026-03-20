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
        int size=0;
        ListNode a=head;
        while(a!=null){
            size++;
            a=a.next;

        }
        int idx=size-n;
        //System.out.print(size+"\n");
        //System.out.print(idx);
        a=head;
        
        ListNode b=new ListNode();
        ListNode dummy=b;
        ListNode test=a;
        int c=0;
        while(a!=null && c<size){
            //System.out.print(c+" ");
            if(c!=idx){
                b.next=a;
                //System.out.print(b.val+" ");
                b=b.next;
            }
            else if(a.next==null){
                b.next=null;
                break;
            }
            a=a.next;
            c++;
        }
        while(test!=null){
            
            test=test.next;
        }
        return dummy.next;
    }
}