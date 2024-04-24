package Java.Problems.linkedlist;

import jdk.internal.util.xml.impl.Pair;

public class SimpleLinkedList {

    Node head;

    class Node {
        int data;
        Node link;
        Node(int data) {
            this.data = data;
        }
    }

    public void insertNode(Node node) {
        node.link = head;
        head = node;
    }

    public void insertNodeEnd(Node node) {
        Node temp=head;
        while(temp.link!=null) {
            temp=temp.link;
        }

        temp.link=node;

    }

    public void insertBeforeNode(int data, Node node) {
        Node tmp = head;
        Node prev=null;
        while(tmp.data!=data){
            prev=tmp;
            tmp=tmp.link;

        }
        node.link=tmp;
        prev.link=node;
    }
    public Node createNode(int data) {
        return new Node(data);
    }

    public void deleteNode(int data) {
        Node temp = head;
        Node prev = null;
        while(temp.data != data) {
            prev=temp;
            temp = temp.link;
        }
        prev.link=temp.link;
    }


    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.insertNode(list.createNode(1));
        list.insertNode(list.createNode(2));
        list.insertNode(list.createNode(3));
        list.insertNode(list.createNode(4));
        list.insertNodeEnd(list.createNode(5));
        list.insertBeforeNode(3, list.createNode(8));
        list.deleteNode(2);

        list.printList();
       /* Pair<Integer, String> pair = new Pair<Integer, String>(
                Integer.valurOf(1), "Geeks");*/
    }

}
