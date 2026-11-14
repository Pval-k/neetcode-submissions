class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode i = list1;
        ListNode j = list2;
        ListNode res;

        if (i == null) {
            return j;
        }

        if (j == null) {
            return i;
        }

        if (i.val <= j.val) {
            res = i;
            i = i.next;
        } else {
            res = j;
            j = j.next;
        }

        ListNode head = res;

        while (i != null && j != null) {
            if (i.val <= j.val) {
                res.next = i;
                res = res.next;
                i = i.next;
            } else {
                res.next = j;
                res = res.next;
                j = j.next;
            }
        }

        if (i != null) {
            res.next = i;
        }

        if (j != null) {
            res.next = j;
        }

        return head;
    }
}