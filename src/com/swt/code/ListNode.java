package com.swt.code;

/**
 * @author 孙文涛
 */
class ListNode {
    int val;
    ListNode next;
	ListNode(){

	}
    ListNode(int x) {
        this.val = x;
    }
	ListNode(int x,ListNode next){
		this.val = x;
		this.next = next;
	}
    @Override
    public String toString() {
        return "ListNode [val=" + val + ", next=" + next + "]";
    }


}
