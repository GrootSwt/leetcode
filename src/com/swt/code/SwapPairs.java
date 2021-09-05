package com.swt.code;

import java.util.Stack;

/**
 * 一条链表两两交换
 * @author swt
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
            if (stack.size() == 2){
                while (!stack.isEmpty()){
                    temp.next = stack.pop();
                    temp = temp.next;
                    temp.next = null;
                }
            }
        }

        if (!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
            temp.next = null;
        }
        return result.next;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
            if (stack.size() == k){
                while (!stack.isEmpty()){
                    temp.next = stack.pop();
                    temp = temp.next;
                    temp.next = null;
                }
            }
        }
        while (!stack.isEmpty()){
            temp.next = stack.remove(0);
            temp = temp.next;
            temp.next = null;
        }
        return result.next;
    }
}
