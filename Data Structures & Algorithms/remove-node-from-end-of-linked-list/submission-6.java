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
        ListNode dummy = new ListNode();
        ListNode cur = head;
        int count= 0;
        dummy.next=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        cur=dummy;
        for(int i =0; i<count-n; i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return dummy.next;
    }
}
