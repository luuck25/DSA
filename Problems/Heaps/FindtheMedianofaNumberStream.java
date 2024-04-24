package Java.Problems.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindtheMedianofaNumberStream {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();


    /*

    we will have 2 heaps max and min - max heap will have one element more than min heap or equal elements in both
    in case of equal fetch top from both and find median
    in case of unequal fine top from max heap
    * https://leetcode.com/problems/find-median-from-data-stream
    * https://www.youtube.com/watch?v=Yv2jzDzYlp8
    * time complexity - O(logn) - time to insert in heap is O(logn)
    * space is O(n) to store n elements in both heaps
    *
    * */
    public FindtheMedianofaNumberStream() {

    }

    public void addNum(int num) {
     if(maxHeap.isEmpty() || maxHeap.peek()>=num) maxHeap.add(num);
     else minHeap.add(num);

     if(maxHeap.size() > minHeap.size()+1) minHeap.add(maxHeap.poll());
     else if (maxHeap.size() <minHeap.size()) maxHeap.add(minHeap.poll());
    }

    public double findMedian() {
        if(maxHeap.size()==minHeap.size()) return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        else return maxHeap.peek();
    }

}
