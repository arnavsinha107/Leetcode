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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((p,q)->p.val-q.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)pq.add(lists[i]);
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            temp.next=node;
            temp=temp.next;
            if(node.next!=null){
                pq.add(node.next);
            }

        }
        return dummy.next;

    }
}