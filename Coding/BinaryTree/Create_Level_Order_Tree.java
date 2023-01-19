import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Level_Order_Tree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Create_Level_Order_Tree()
    {
        this.root=CreateTree();
    }
    private Node CreateTree()
    {
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int item=sc.nextInt();
        nn.val=item;
        root=nn;
        q.add(nn);
        while(!q.isEmpty())
        {
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1 !=-1)
            {
                Node node =new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if(c2 !=-1)
            {
                Node node =new Node();
                node.val=c2;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    
    }
    private void PreOrder(Node node)
     {
        if(node==null)  return;
        System.out.println(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
     }
     public static void main(String[] args) {
        Create_Level_Order_Tree cl=new Create_Level_Order_Tree();
        cl.PreOrder(cl.root);
     }
}
