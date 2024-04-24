package Java.Problems.TreeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {

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

        public List<Double> averageOfLevels(TreeNode root) {

            if(root==null) return null;
            Queue<TreeNode> qq = new LinkedList<>();
            List<Double> result = new ArrayList<>();
            qq.add(root);
            while(!qq.isEmpty()){
                int qSize = qq.size();
                Double sum =0.0;
                for(int i=0; i< qSize;i++){
                    TreeNode currNode = qq.remove();
                    sum+= currNode.val;
                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
                }
                Double avg  = sum/qSize;
                result.add(avg);
            }
            return result;
        }
    }





}
