public class Diameter_BinaryTree {
     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
        
       
    
}
class Solution {
    public int ht(TreeNode root)
    {
        if(root==null) return -1;
        int lh=ht(root.left);
        int rh=ht(root.right);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        //Time complexity 4T(n/2) =O(n^2)
        //after getting diameter root is calling height function 
        if(root==null) return 0;
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        int sd=ht(root.left) + ht(root.right) +2;
        return Math.max(ld,Math.max(rd,sd));
    }
    //efficient solution O(n)
    class solution{
        public class DaiPair{
            int ht=-1;
            int d=0;
        }

        public int diameterOfBinaryTree2(TreeNode root) {
            //keep track of diameter ans height
            return diameter(root).d;

        }
        public DaiPair diameter(TreeNode root)
        {
            if(root==null)
            {
                return new DaiPair();
            }
            DaiPair ldp=diameter(root.left); //left diameter pair
            DaiPair rdp=diameter(root.left); //right diameter pair
            DaiPair sdp =new DaiPair();  //Self dia pair
            int sd=ldp.ht +rdp.ht +2;
            sdp.d=Math.max(ldp.d,Math.max(rdp.d,sd));
            sdp.ht =Math.max(ldp.ht,rdp.ht )+1;
            return sdp;
        }
}


}
