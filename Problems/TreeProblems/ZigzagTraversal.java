package Java.Problems.TreeProblems;

import java.util.*;

public class ZigzagTraversal {

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


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> qq = new LinkedList<>(); // define queue
        qq.add(root);

        boolean reverse = false;
        while(!qq.isEmpty()){

            int queueSize = qq.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                TreeNode currNode = qq.remove();
                list.add(currNode.val);
                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
            }
            // add zig zag or list reversal logic
            if(reverse){
                Collections.reverse(list);
                reverse = false;
            }
            else reverse = true;
            if(result.isEmpty()) reverse = true;
            result.add(list);

        }


        return result;
    }
}
