package Java.Problems.TreeDFS;

public class BinaryTreePathSum {

    public class TreeNode { int val;TreeNode left;TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
  }
    public static void main(String[] args) {


    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null) return false;
        if(root.val==targetSum && root.left==null && root.right==null) return true;

        // traverse left and right sub trees
        Boolean flag1 = hasPathSum(root.left,targetSum - root.val);
        Boolean flag2 = hasPathSum(root.right,targetSum - root.val);
         return flag1 || flag2;

    }
}
