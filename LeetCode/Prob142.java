/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        ListNode ans = head;
        boolean flag = false;

        if (head == null) {
            return null;
        }

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (turtle == hare) {
                flag = true;
                break;
            }
        }

        if (flag) {
            while (turtle != ans) {
                turtle = turtle.next;
                ans = ans.next;
            }
            return ans;
        }

        return null;

    }
}