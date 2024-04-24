package Java.Problems.TreeDFS;


import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/problems/sum-root-to-leaf-numbers/
* */
public class SumofPathNumbers {

    static class  TreeNode {
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

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        sumNumbers(root);
    }

    public static int sumNumbers(TreeNode root) {
        List<Integer> numlist = new ArrayList<>();
       getSum(root,numlist,0);
       int sum = 0;
       for(int num : numlist){

           sum+=num;
       }
       return sum;
    }

    public static  void getSum(TreeNode currNode,List<Integer> numlist,int sum){

        if(currNode==null) return ;
        if(currNode.left==null && currNode.right==null) numlist.add(sum+ currNode.val);
        else
        {
            getSum(currNode.left,numlist,(sum+currNode.val)*10);
            getSum(currNode.right,numlist,(sum+currNode.val)*10);
        }

        sum=sum - currNode.val;

    }


}
