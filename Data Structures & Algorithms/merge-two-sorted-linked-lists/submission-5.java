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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode res;
        ListNode head;

        if(i == null){
            return j;
        } else if(j == null){
            return i;
        } else if(i.val <= j.val){
            res = i;
            i = i.next;
            head = res;
        } else{
            res = j;
            j = j.next;
            head = res;
        }

        while(i != null || j != null){
            if(i == null){
                res.next = j;
                j = j.next;
            } else if(j == null){
                res.next = i;
                i = i.next;
            } else if(i.val <= j.val){
                res.next = i;
                i = i.next;
            } else{
                res.next = j;
                j = j.next;
            }
            res = res.next;
        }
        return head;
    }
}