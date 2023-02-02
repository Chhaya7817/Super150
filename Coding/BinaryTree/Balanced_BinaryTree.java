public class Balanced_BinaryTree {
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
//O(n2)
class Solution {
    public int ht(TreeNode root)
    {
        if(root==null) return -1;
        int lh=ht(root.left);
        int rh=ht(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean isbal=Math.abs(ht(root.left)-ht(root.right))<=1;
        return left && right && isbal;
    }
}
}
