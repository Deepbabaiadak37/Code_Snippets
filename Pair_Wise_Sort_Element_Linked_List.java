class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node node)
    {
        // code here
        
              // Base Case: The list is empty or has only one node
        if (node == null || node.next == null) {
            return node;
        }
 
        // Store head of list after two nodes
        Node remaining = node.next.next;
 
        // Change head
        Node newhead = node.next;
 
        // Change next of second node
        node.next.next = node;
 
        // Recur for remaining list and change next of head
        node.next = pairwiseSwap(remaining);
 
        // Return new head of modified list
        return newhead;
    }
}