package Java.Problems.TreeDFS;

public class ValidateBinarySearchTree {
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

    public boolean isValidBST(TreeNode root) {

    return tree(root);

    }

    public boolean tree(TreeNode node){

        if (node==null) return false;

        if(node.left!=null && node.left!=null && node.left.val < node.val && node.right.val > node.val) return true;
       return tree(node.left) && tree(node.right);

    }

}
