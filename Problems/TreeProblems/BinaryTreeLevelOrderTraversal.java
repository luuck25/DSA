package Java.Problems.TreeProblems;


import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    /*
 https://www.youtube.com/watch?v=-DzowlcaUmE
    *
     */
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


        /*
        * Logic is (see youtube video)
        *
        * add Node in queue
        * while removing element add left and right of that node
        * add elements of that level in list and finally store in result List
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

            result.add(list);

        }


    return result;
    }
}
