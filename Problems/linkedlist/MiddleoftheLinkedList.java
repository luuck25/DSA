package Java.Problems.linkedlist;

public class MiddleoftheLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {



    }

    /*
    *
    * space - o(1)
    * time - o(n/2) -> o(n)
    *https://www.youtube.com/watch?v=IPaMfcxQtP0
    *https://leetcode.com/problems/middle-of-the-linked-list/
    *
    * */
    public ListNode middleNode(ListNode head) {

        ListNode slowP= head;
        ListNode fastP = head;

        while(fastP!=null && fastP.next!=null) {
            slowP= slowP.next;
            fastP= fastP.next.next;
        }
            return slowP;
    }
}
