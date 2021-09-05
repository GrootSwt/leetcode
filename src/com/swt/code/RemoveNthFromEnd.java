/**
 * 
 */
package com.swt.code;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {
	// 倒数第n个节点是正数的所有节点减去n加上1
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		List<ListNode> list = new ArrayList<>();
		ListNode temp02 = head;
		while(temp02 != null) {
			list.add(temp02);
			temp02 = temp02.next;
		}
		if(n == list.size()) {
			return head.next;
		}
		int index = list.size() - n;
		ListNode result = head;
		ListNode temp = result;
		for (int i = 1; i < list.size(); i++) {
			if(i == index) {
				temp.next = null;
				continue;
			}else {
				temp.next = list.get(i);
				temp = temp.next;
			}
		}
		return result;
	}
	
	/**
	 * 倒数第n个节点
	 * 可以在前面多加一个节点
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd02(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		int length = 0;
		ListNode first = head;
		while(first != null) {
			length++;
			first = first.next;
		}
		
		first = temp;
		length -= n;
		while(length > 0) {
			length--;
			first = first.next;
		}
		
		first.next = first.next.next;
		return temp.next;
	}
	
	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node1 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
		ListNode result = removeNthFromEnd.removeNthFromEnd02(node1, 2);
		System.out.println(result);
	}
}
