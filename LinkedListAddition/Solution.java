/**
 * Solution for the 'Add Two Numbers' problem on leetcode.com
 * Utilises the ListNode class to define a single-linked list
 *
 * @author Aaron Hooper
 * @version 1.0
 * @since 2021.01.07
 */


public class Solution {
    /**
     * Given two non-empty linked lists representing two non-negative integers, with digits stored in reverse-order,
     * this method adds the numbers and returns the result as a linked-list, with digits stored in reverse-order.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode current = dummyHead;
        int carry = 0;
        int x = 0;
        int y = 0;
        int sum = 0;


        while(n1 != null || n2 != null) {
            x = (n1 != null) ? n1.val : 0;
            y = (n2 != null) ? n2.val : 0;
            sum = x + y + carry;

            carry = sum/10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(n1 != null) {
                n1 = n1.next;
            }
            if(n2 != null) {
                n2 = n2.next;
            }
        }
        if(carry > 0) {
            current.next = new ListNode(1);
        }

        return dummyHead.next;
    }
}
