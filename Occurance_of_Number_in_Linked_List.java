class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data==search_for)
                count++;
            temp=temp.next;
        }
        
        return count;
    }
}