package Java.Problems.TreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBinarySearchTreeAndTraversal {



    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{

        static int idx=-1;

        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);

            return newNode;
        }

        public static void  preOrder(Node root){

           if(root==null) return;
            System.out.println(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void Inorder(Node root){

            if(root==null) return;
            Inorder(root.left);
            System.out.println(root.data);
           Inorder(root.right);

        }

        public static void Postorder(Node root){

            if(root==null) return;
            Postorder(root.left);
            Postorder(root.right);
            System.out.println(root.data);
        }

        public static void Leveltraverse(Node root){
            Queue<Node> qq = new LinkedList<>();
            qq.add(root);
            qq.add(null);

            while(!qq.isEmpty()){
                Node curr = qq.remove();
                if(curr==null) {
                    System.out.println(" ");
                    if(qq.isEmpty()) break;
                    else qq.add(null);
                }
                else
                {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null) qq.add(curr.left);
                    if(curr.right!=null) qq.add(curr.right);
                }
            }
        }

        public static int countNode(Node root){

            if(root==null) return 0 ;
           int leftNodes = countNode(root.left);
           int rightNodes  = countNode(root.right);
           return leftNodes+rightNodes+1;
        }
        public static int sumOfNode(Node root){

            if(root==null) return 0 ;
            int sumleftNodes = sumOfNode(root.left);
            int sumrightNodes  = sumOfNode(root.right);
            return sumleftNodes+sumrightNodes+root.data;
        }

        public static int HeightOfTree(Node root){

            if(root==null) return 0 ;
            int leftHeight = HeightOfTree(root.left);
            int rightHeight  = HeightOfTree(root.right);
            int height = Math.max(leftHeight,rightHeight)+1;
            return height;
        }



    }

    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
     //   System.out.println(root.data);
       tree.preOrder(root);
       // tree.Inorder(root);
      //  tree.Postorder(root);

        tree.Leveltraverse(root);

        System.out.println(BinaryTree.countNode(root));





    }
}
