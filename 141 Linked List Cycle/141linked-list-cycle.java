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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(slow==null || fast==null) return false;
        while(fast!=null && fast.next!=null  ){
            //System.out.print("\nFast: "+fast.val+"Slow: "+slow.val);
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow) return true;
        }
        return false;
    }
}