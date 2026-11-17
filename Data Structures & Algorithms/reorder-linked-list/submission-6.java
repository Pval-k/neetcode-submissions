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
    public void reorderList(ListNode head) {
        //split into 2 linked list by finding half point
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the second linked list
        ListNode prev = null;
        ListNode cur = slow.next;
        slow.next = null;

        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }

        //connect the 2 lists
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode tmp1 = first.next;
            first.next = second;

            ListNode tmp2 = second.next;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;

            

        }
    }
}
