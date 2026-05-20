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
            int count = 0;
        ListNode cur = head;
        ListNode dummy = new ListNode();
        dummy.next=head;
        cur=dummy;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        cur=dummy;
        for (int i = 0; i<count-n-1 && cur!=null && cur.next!=null; i++){
            cur = cur.next;
        }
        cur.next=cur.next.next;
        return dummy.next;
    }
}
