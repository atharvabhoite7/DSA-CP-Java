/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode hare, turtle, temp;
        hare = turtle = temp = head;

        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        turtle.next = reverse(turtle.next);

        turtle = turtle.next;

        while(turtle != null){
            if(turtle.val != temp.val){
                return false;
            }
            turtle = turtle.next;
            temp = temp.next;
        }
        return true;


    }

    public ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next; 
        }
        return newHead;
    }
}