package Java.Problems.linkedlist;


public class LinkedListCycle {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static void main(String[] args) {


    }
    /*
    * time comp o(n)
    * space o (1)
    *https://www.youtube.com/watch?v=OQtvTZxA7-k
    * -Floyd Warshall Algorithm--
    * we can do it using hashtable set as well but with that we wll use additional space so space com will be 0(n)
    * */

    public boolean hasCycle(ListNode head) {

         if(head==null) return false;
         ListNode slowPointer = head;
        ListNode fastPointer = head;

         while(fastPointer!=null && fastPointer.next!=null)
         {
             slowPointer= slowPointer.next;
             fastPointer= fastPointer.next.next;

             if(slowPointer==fastPointer) return true;
        }
    return false;

    }
}
