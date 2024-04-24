package Java.Problems.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    /*
    * https://leetcode.com/problems/sliding-window-median/
    * educative solution
    *
    * probelm is similar to median of stream
    *
    * we need to take care of removal
    *
    * also declare array to store number
    *
    *
    *
    * */
    public double[] medianSlidingWindow(int[] nums, int k) {

        double[] result = new double[nums.length -k +1];
        for(int i=0; i<nums.length;i++)
        {
            if(maxHeap.isEmpty() || maxHeap.peek()>= nums[i]) maxHeap.add(nums[i]);
            else minHeap.add(nums[i]);
            rebalanceHeaps();

            // sliding window condition meet
            if(i-k+1>=0){
                if(maxHeap.size()==minHeap.size()) result[i-k+1]= maxHeap.peek()/2.0 + minHeap.peek()/2.0;
                else result[i-k+1]= maxHeap.peek();
                int elememttodelete = nums[i-k+1];
                if(elememttodelete <=maxHeap.peek()) maxHeap.remove(elememttodelete);
                else minHeap.remove(elememttodelete);
                rebalanceHeaps();
            }

        }

        return result;
    }
    private void rebalanceHeaps(){
        if(maxHeap.size()> minHeap.size()+1) minHeap.add(maxHeap.poll());
        else if (minHeap.size()> maxHeap.size()) maxHeap.add(minHeap.poll());
    }
}
