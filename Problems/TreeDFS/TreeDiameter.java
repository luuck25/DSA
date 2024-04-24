package Java.Problems.TreeDFS;

public class TreeDiameter {

    int treeDiameter = 0;
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

    /*
    * https://leetcode.com/problems/diameter-of-binary-tree
    *https://www.youtube.com/watch?v=Toe0UQMWhjM
    *
    * Height of tree will be  - Max of height of left node and right node  + 1
    *
    * Diameter of tree will be - height of left node + height of right node + 1
    *
    *
    * */
    public int diameterOfBinaryTree(TreeNode root) {

        getHeight(root);
        return treeDiameter;
    }

    public int getHeight(TreeNode node){

        if(node==null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        int diamater = left + right +1;

        treeDiameter = Math.max(diamater,treeDiameter);
        return Math.max(left,right)+1;

    }

}



