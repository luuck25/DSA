package Java.Problems.linkedlist;

public class ReorderList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {

        // if head will be null or head.next will be null simply return ;
        if(head==null || head.next==null)return ;

        ListNode slow= head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        ListNode reverseSecondHalf = reverse(slow.next);
        slow.next = null;


        ListNode p2 = reverseSecondHalf;

        while(head!=null && p2!=null)
        {
            ListNode temp_p1=  head.next;
            ListNode temp_p2=  p2.next;
            // ListNode temp_p2= p2.next;


            p2.next= temp_p1;
            head.next = p2;
            p2=temp_p2;
            head=temp_p1;
        }


    }

    public ListNode reverse(ListNode node)
    {
        ListNode current = node;
        ListNode prev = null;

        while(current!=null)
        {
            ListNode nextNode= current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;

    }


}

