//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    Node head = null, lastNode = null;
    void help(Node root){
        if(root == null) 
            return;
        help(root.left);
        if(head == null) 
            head = root;
        if(lastNode != null) 
            lastNode.right = root;
        root.left = lastNode;
        lastNode = root;
        help(root.right);
    }
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
        help(root);
        return head;
    }
}
        //  Your code here
        
        /*
        Node[] arr = dfs(root);
        return arr[0];
    }
    
    Node[] dfs(Node root){
        if(root.left == null && root.right == null){
            return new Node[]{root, root};
        }
        if(root.left == null){
            Node[] r = dfs(root.right);
            root.right = r[0]; // 10 -> 36
            r[0].left = root;  // 10 <- 36
            return new Node[]{root, r[1]}; //10, 15
        }
        Node[] l = dfs(root.left);
        l[1].right = root; //30 -> 10
        root.left = l[1]; //30 <- 10
        
        if(root.right == null){
            return new Node[]{l[0],root}; //25, 10
        }
        
        Node[] r = dfs(root.right);
        root.right = r[0]; //10 -> 36
        r[0].left = root; //10 <- 36
        
        return new Node[]{l[0],r[1]}; // 25, 15
    }
} */