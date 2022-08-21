public static Node insert(Node root,int data) {
        
    if(root==null) return new Node(data);
    Node temp=root;
    
    while(true)
    {
        if(temp.data<=data)
        {
            if(temp.right!=null) temp=temp.right;
            else
            {
                temp.right=new Node(data);
                break;
            }
        }
        else
        {
            if(temp.left!=null) temp=temp.left;
            else
            {
                temp.left=new Node(data);
                break;
            }
        }
                
    }
    return root;
        
        
    	
    }