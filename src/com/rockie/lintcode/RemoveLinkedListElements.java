package com.rockie.lintcode;

import com.rockie.lintcode.model.ListNode;

/**
 * Created by baidu on 16/2/23.
 */
public class RemoveLinkedListElements {
    /**
     * @param head a ListNode
     * @param val  an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        };

        if (head == null) {
            return null;
        }

        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}

