package com.swt.code;

/**
 * 合并链表
 * @author swt
 */
public class MergeKLists {
    /**
     *
     * @param lists 链表集合
     * @return  返回所有链表合并
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++){
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }

    /**
     *
     * @param list01    第一个链表
     * @param list02    第二个链表
     * @return  两个链表合并结果
     */
    public ListNode mergeTwoLists(ListNode list01, ListNode list02){
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (list01 != null || list02 != null){
            if (list01 == null){
                temp.next = list02;
                break;
            }else if (list02 == null){
                temp.next = list01;
                break;
            }else {
                if(list01.val <= list02.val){
                    temp.next = list01;
                    temp = temp.next;
                    list01 = list01.next;
                }else{
                    temp.next = list02;
                    temp = temp.next;
                    list02 = list02.next;
                }
            }
        }
        return result.next;
    }
}
