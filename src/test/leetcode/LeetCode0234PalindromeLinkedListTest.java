package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0234PalindromeLinkedListTest {

    @Test
    void isPalindrome() {

        assertEquals(false, new LeetCode0234PalindromeLinkedList().isPalindrome(null));
    }

    @Test
    void isPalindrome2() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        assertEquals(false, new LeetCode0234PalindromeLinkedList().isPalindrome(n1));
    }

    @Test
    void isPalindrome3() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        assertEquals(true, new LeetCode0234PalindromeLinkedList().isPalindrome(n1));
    }

    @Test
    void isPalindrome4() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        assertEquals(true, new LeetCode0234PalindromeLinkedList().isPalindrome(n1));
    }
}