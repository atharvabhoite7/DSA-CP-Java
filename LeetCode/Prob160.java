/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode dumA, dumB;
        dumA = headA;
        dumB = headB;

        while (dumA != dumB) {
            dumA = dumA == null ? headB : dumA.next;
            dumB = dumB == null ? headA : dumB.next;
        }
        return dumA;

    }
}