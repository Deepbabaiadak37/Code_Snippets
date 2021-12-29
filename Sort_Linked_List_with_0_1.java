class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            ++count;
            temp=temp.next;
        }
        int[] a=new int[count];
        
        temp=head;
        int k=0;
        while(temp!=null)
        {
            a[k++]=temp.data;
            temp=temp.next;
        }
        Arrays.sort(a);
        Node head1=head;
        
        for(int i=0;i<count;i++)
        {
            head1.data=a[i];
            head1=head1.next;
        }
        
        return head;
    }
}

