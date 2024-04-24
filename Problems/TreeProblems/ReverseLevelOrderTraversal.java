package Java.Problems.TreeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrderTraversal {

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

        List<List<Integer>> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> qq = new LinkedList<>(); // define queue
        qq.add(root);


        /*
        same logic of Level order traversal
        Just use Linkedlist and append node at start of linkedlist
         *
         * */
        while(!qq.isEmpty()){

            int queueSize = qq.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                TreeNode currNode = qq.remove();
                list.add(currNode.val);
                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
            }
            result.add(0,list);

        }


        return result;
    }
}
