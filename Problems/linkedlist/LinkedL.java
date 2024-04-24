package Java.Problems.linkedlist;


public class LinkedL {
    Node head;

    class Node{
           Node next;
           String data;
           Node(String data) {
               this.data=data;
               this.next=null;
           }
       }

       public void deleteFirst()
       {
           if(head==null) System.out.println("List is empty");
           head=head.next;
       }

    public void deleteLast()
    {
        if(head==null) System.out.println("List is empty");
        if(head.next==null) head=null;
        Node preNode = head;
        Node currNode = head;
        while(currNode.next!=null){
            preNode= currNode;
            currNode= currNode.next;
        }
        preNode.next=null;

    }
       public void addFirst(String data)
       {
           Node newNode = new Node(data);
           if (head==null)
           {
               head = newNode;
               return;
           }
           newNode.next=head;
           head= newNode;

       }

       public void addLast(String data)
       {
           Node newNode = new Node(data);
           if (head==null)
           {
               head = newNode;
               return;
           }

           Node currNode = head;

           while(currNode.next!=null)
           {
               currNode= currNode.next;
           }

           currNode.next = newNode;

       }

       public void printList()
       {
           Node currNode = head;
           while(currNode!=null)
           {
               System.out.print(currNode.data + "-->");
               currNode= currNode.next;
           }
           System.out.print("NULL");

       }


    public static void main(String[] args) {

           LinkedL testlist = new LinkedL();
           testlist.addFirst("lakesh");
           testlist.addFirst("kumar");
           testlist.addFirst("lucky");
           testlist.printList();
           System.out.println("");
           testlist.deleteLast();
           testlist.printList();
           testlist.addLast("lucky");
       //    testlist.printList();



    }



}
