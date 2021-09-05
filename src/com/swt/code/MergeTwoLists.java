package com.swt.code;

/**
 * @author swt
 */
public class MergeTwoLists {
    ListNode result = new ListNode(0);
    ListNode lastNode = result;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                lastNode.next = l2;
                break;
            } else if (l2 == null) {
                lastNode.next = l1;
                break;
            } else {
                if (l1.val <= l2.val) {
                    lastNode.next = l1;
                    l1 = l1.next;
                } else {
                    lastNode.next = l2;
                    l2 = l2.next;
                }

                lastNode = lastNode.next;
            }
        }
        return result.next;
    }
}
