package Java.Problems.Heaps;

import java.util.PriorityQueue;

public class KthLargestElement {

    /*
    * same as smallest element
    *
    * Here we will take max heap
    *
    * we will add number if next number is greater than root
    *
    * */

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i< k;i++){
            pq.add(nums[i]);
        }

        // int toremove = k-1;

        for (int i=k;i< nums.length;i++){

            if(nums[i]> pq.peek()){

                pq.poll();
                pq.add(nums[i]);
            }

        }

        return pq.peek();
    }
}
