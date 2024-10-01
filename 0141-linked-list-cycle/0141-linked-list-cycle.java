/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

        // Brute force solution
        // ListNode temp=head;
        // Map<ListNode,Integer> nodeMap = new HashMap<>();
        // while(temp!=null){
        //    if(nodeMap.containsKey(temp)){
        //     return true;
        //    }
        //    nodeMap.put(temp,1);
        //    temp=temp.next;
        // }
        // return false;
    }
}