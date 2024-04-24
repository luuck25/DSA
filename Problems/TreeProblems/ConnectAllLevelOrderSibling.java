package Java.Problems.TreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectAllLevelOrderSibling {

    class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;
        TreeNode  next;

        public TreeNode(int x) {
            val = x;
            left = right = next =null;
        }


    }

    public static void connect(TreeNode node) {

        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(node);
        TreeNode prevNode = null;
        TreeNode currNode= null;
        while(!qq.isEmpty()){
            currNode= qq.poll();
                if(prevNode!=null) prevNode.next= currNode;
                prevNode = currNode;

                if(currNode.left!=null) qq.add(currNode.left);
                if(currNode.right!=null) qq.add(currNode.right);
            }
        }
}
