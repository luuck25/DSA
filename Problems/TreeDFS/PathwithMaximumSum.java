package Java.Problems.TreeDFS;

public class PathwithMaximumSum {

    int sum ;
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
    public int maxPathSum(TreeNode root) {

        sum = Integer.MIN_VALUE;
        getSum(root);
        return sum;
    }

    /*
    * https://leetcode.com/problems/binary-tree-maximum-path-sum/
    *
    * t - o(n)
    * s - o(n)
    * */


    public int getSum(TreeNode node){

        if (node==null) return 0;

        int sumLeft = getSum(node.left); //left sum
        int sumRight = getSum(node.right); //right tree sum

        sumLeft = Math.max(sumLeft,0);  //ignore if negative sum
        sumRight = Math.max(sumRight,0);

        //current sum
        int localSum = sumLeft + sumRight + node.val;


        sum = Math.max(sum,localSum);

        // max sum of any path will be max of sum from left or right sub tree plus current node value
        return Math.max(sumLeft,sumRight)+ node.val;


    }



}
