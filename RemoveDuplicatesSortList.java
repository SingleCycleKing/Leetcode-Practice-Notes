/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesSortList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list=head;
        if (list == null) return null;
        int curNum = list.val;
        while (list.next != null) {
            if (list.next.val == curNum)
                list.next = list.next.next;
            else {
                curNum = list.next.val;
                list = list.next;
            }
        }
        return list;
    }
}
