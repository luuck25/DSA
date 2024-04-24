package Java.Problems.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumber {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {

        /*
        https://www.youtube.com/watch?v=FW-H9IqEhEU
        t - O(nlogk)
        * */

        /*
        *
        * similar ques sum of numbers between kth smallest
        *
        * */

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i< k;i++){
            pq.add(arr[i]);
        }

        // int toremove = k-1;

        for (int i=k;i< r-l+1;i++){

            if(arr[i]< pq.peek()){

                pq.poll();
                pq.add(arr[i]);
            }

        }

        return pq.peek();
        //Your code here
    }
}
