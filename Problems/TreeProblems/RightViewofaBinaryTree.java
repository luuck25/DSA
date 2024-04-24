package Java.Problems.TreeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewofaBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {

       List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> qq = new LinkedList<>(); // define queue
        qq.add(root);


        while(!qq.isEmpty()){

            int queueSize = qq.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                TreeNode currNode = qq.remove();
               if(i==queueSize-1) result.add(currNode.val);
                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
            }
        }


        return result;
    }


}
