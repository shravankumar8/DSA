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
    public ListNode deleteDuplicates(ListNode head) {
        // Edge case: If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node by updating the next pointer
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head; // Return the head of the modified list
    }
}