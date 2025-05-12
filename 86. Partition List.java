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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyright = new  ListNode(0);
        ListNode dummyleft = new  ListNode(0);
        ListNode left = dummyleft;
        ListNode right = dummyright;
        
        while(head!=null){
            if(head.val< x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head=head.next;
        }
        left.next = dummyright.next;
        right.next = null;
        return dummyleft.next;
    }
}
