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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode curr=head;
        ListNode pre=head;
        if(head!=null)
        {
             while(true)
            {
                if(curr.next==null || curr.next.next==null)
                    return false;
                curr=curr.next.next;
                pre=pre.next;

                if(pre==curr)
                    return true;
                else if(pre==null)
                    return false;
            }
        }
        else
            {
                return false;
            }
        
       
        
    }
}