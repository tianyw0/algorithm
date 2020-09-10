package leetcode;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0142LinkedListCycleII1 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        while(head.next != null) {
            set.add(head);
            if(set.contains(head.next)) {
                return head.next;
            }
            head = head.next;
        }
        return null;
    }
}