Date: 05.04.25
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
    public ListNode mergeNodes(ListNode head) {
        ListNode start = head;
        ListNode end = head.next;
        int sum =0;

        while (end != null) {
            if (end.val != 0) {
                sum += end.val;
            } else {
                start = start.next;
                start.val = sum;
                sum=0;
            }
            end = end.next; 
        }
        start.next=null;
        return head.next;
    }
}
