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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        ListNode p=head;
        ListNode q=head.next;
        for(int i=1;i<count/2;i++){
            p=p.next;
            q=q.next;
        }
        p.next=q.next;
        q.next=null;
        return head;
    }
}