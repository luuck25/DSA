package Java.Problems.TreeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumDepthofaBinaryTree {

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

    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> qq = new LinkedList<>();
        int depth =0;
        qq.add(root);
        while(!qq.isEmpty()){

            depth++;
            int qSize = qq.size();

           // Boolean end = false;
            for(int i=0; i< qSize;i++){
                TreeNode currNode = qq.remove();
                if (currNode.left==null && currNode.right==null) return depth;
                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
            }


        }
        return depth;
    }

    }

