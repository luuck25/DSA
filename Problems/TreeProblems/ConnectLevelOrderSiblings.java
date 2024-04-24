package Java.Problems.TreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectLevelOrderSiblings {

    // Populating Next Right Pointers in Each Node II

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {

        Queue<Node> qq = new LinkedList<>();
        qq.add(root);

        while(!qq.isEmpty()){

            Node prevNode = null;
            int size = qq.size();
            for(int i=0;i<size;i++){
                Node currNode = qq.remove();
                if (prevNode!=null)  prevNode.next= currNode;
                 prevNode=currNode;
           if(currNode.left!=null)   qq.add(currNode.left);
           if(currNode.right!=null)  qq.add(currNode.right);
            }

        }


        return root;

    }

}
