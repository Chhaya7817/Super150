import java.util.Scanner;

public class Binary_Tree {
    private class Node{
        int val;
        Node left;
        Node right;
    }
    Scanner sc=new Scanner(System.in);
    private Node root;
    public Binary_Tree()
    {
        root=CreateTree();
    }
    private Node CreateTree()
    {
        int item=sc.nextInt();

        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();  //has left child or not
        if(hlc)
            nn.left=CreateTree();   //create node for left child if it have child
        boolean hrc=sc.nextBoolean();
        if(hrc)
            nn.right=CreateTree();
        return nn;
    }

    //input--[10 true 5 false true 7 false false true 12 true 9 false false false]

    /*             10
     *          /    \
     *          5       12
     *        /  \     / 
     *            7   9   
     * 
     * 
     */

    public void display()
    {
        Display(root);
    }
     private void Display(Node node)
     {
        if(node==null)  return;
        String s="";
        s="<--"+s+ node.val+"-->";
        if(node.left!=null)
        {
            s=node.left.val +s;
        }
        else{
            s="."+s;
        }
        if(node.right!=null)
        {
            s=s+node.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);

     }
     //Traversal-PReOrder
     public void PreOrder()
     {
        PreOrder(root);
     }
     private void PreOrder(Node node)
     {
        if(node==null)  return;
        System.out.println(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
     }
     
     //Traversal-PostOrder
     public void PostOrder()
     {
        PostOrder(root);
     }
     private void PostOrder(Node node)
     {
        if(node==null)  return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.val);
     }
     
     //Traversal InOrder
     public void InOrder()
     {
        InOrder(root);
     }
     private void InOrder(Node node)
     {
        if(node==null)  return;
        InOrder(node.left);
        System.out.print(node.val+" ");
        InOrder(node.right);
     }
     
     public boolean Search(int item)
     {
            return Search(root,item);
     }
     private boolean Search(Node node,int item)
     {
            if(node==null)
                return false;
            if(node.val==item)
                return true;
            boolean left=Search(node.left, item);
            boolean right=Search(node.right, item);
            return left||right;
     }
}
