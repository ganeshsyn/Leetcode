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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        // find middle
        ListNode middle=middle(head);

        // Divide into 2 halves
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;

        // Recursively sort Left and right
        left=sortList(left);
        right=sortList(right);

        // Merge
        return merge(left,right);
    }

    // find Middle
    ListNode middle(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
       ListNode slow=head;
       ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    // Merge 
    ListNode merge(ListNode left,ListNode right){
        // create a dummy node to serve as head of mergeLL
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;

        // Traverse each list simulataneously
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }

        // if left or right is still not empty
        if(left!=null){
            temp.next=left;
        }
        else{
            temp.next=right;
        }
        return dummyNode.next;
    }
        
    
}