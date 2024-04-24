package Java.Problems.linkedlist;

public class StartofLinkedListCycle {

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
* https://leetcode.com/problems/linked-list-cycle-ii/solutions/3778919/simple-solution-java-c-clean-codes-easy-to-understand/
* https://leetcode.com/problems/linked-list-cycle-ii/
* https://www.youtube.com/watch?v=95ZfuoSAUPI
*
* Approach
*LinkedlistCycle - 1 (find meeting point)
*
* then set one of the pointer as head and move both pointer at same speed untill they meet
*
* */
    public ListNode detectCycle(ListNode head) {

        if(head==null) return null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer!=null && fastPointer.next!=null)
        {
            slowPointer= slowPointer.next;
            fastPointer= fastPointer.next.next;

            if(slowPointer==fastPointer){
                fastPointer=head;

                while(slowPointer!=fastPointer){

                    fastPointer=fastPointer.next;
                    slowPointer=slowPointer.next;

                }

                return slowPointer;


            }
        }


        return null;



    }
}
