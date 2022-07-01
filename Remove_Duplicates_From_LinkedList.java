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
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode temp2=head.next;
        
        while(temp!=null)
        {
            if(temp.next==null) return head;
            if(temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
                }
            else
            {
                temp=temp.next;
            }
                
        }
        
        return head;
        
    }
}