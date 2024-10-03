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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==n){
            ListNode newHead=head.next;
            return newHead;
        }
        if(n==length){
            return head;
        }
        temp=head;
        for(int i=1;i<length-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}