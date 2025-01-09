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
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode current=head;
        while(current !=null ){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
            ListNode mid=findMiddle(head);
            ListNode headSecond=reverse(mid);
            ListNode reverseHead=headSecond;
            while(head!=null && headSecond !=null){
                if(head.val != headSecond.val){
                    break;
                }
                head=head.next;
                headSecond=headSecond.next;
            }
            reverse(reverseHead);
            return head==null || headSecond==null;
        // the first step is find the miiddle 

        
    }
}