
class GfG
{
    int compare(Node node1, Node node2)
    {
      //Your code here
      Node temp1=node1;
      Node temp2=node2;
      int result=0;
      
      
      while(temp1!=null && temp2!=null)
      {
        if(temp1.data==temp2.data)
            result=0;
        else if(temp1.data!=temp2.data)
        {
            int val1=(int)temp1.data;
            int val2=(int)temp2.data;
            if(val1>val2)
                result=1;
            else
                result=-1;
        
        }
        
        if(result==1 || result==-1)
        break;
        
        temp1=temp1.next;
        temp2=temp2.next;
      }
      
      
      
      return result;
    }
}