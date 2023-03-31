/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        // ListNode newNode = new ListNode();

        if (curr == null || curr.next == null) {
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        ListNode ans = new ListNode();

        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) == 1) {
                ListNode newNode = new ListNode(list.get(i));
                if (ans == null) {
                    ans = newNode;
                    break;
                }

                ListNode currNode = ans;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }

                currNode.next = newNode;
            }
        }

        ans = ans.next;
        return ans;
    }
}