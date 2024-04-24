package Java.Problems.linkedlist;

public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {


    }
    /*
    * https://leetcode.com/problems/palindrome-linked-list/solutions/4238376/beats-100-java-3ms-clean-code-with-explanation/
    *
    * time - o(n)
    * space - o(1)
    *
    * Approach - using earlier find middle problem find the middle of list
    *
    * reverse the 2nd half and compare with first
    *
    * */

    public boolean isPalindrome(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;

        while(fast.next!=null && fast!=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        ListNode reverseSecondHalf = reverse(slow);

        ListNode p1 = head;
        ListNode p2 = reverseSecondHalf;

        while(p1!=null && p2!=null)
        {
            if(p1.val!=p2.val) return false;

            p1=p1.next;
            p2=p2.next;
        }

        return true;
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
