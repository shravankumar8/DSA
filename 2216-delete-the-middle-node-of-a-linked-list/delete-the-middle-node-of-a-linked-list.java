class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If the list is empty or has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the previous node of slow

        // Move fast two steps and slow one step at a time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow; // Keep track of the node before slow
            slow = slow.next;
        }

        // Delete the middle node
        prev.next = slow.next;

        return head;
    }
}
