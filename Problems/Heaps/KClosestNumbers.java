package Java.Problems.Heaps;

import java.util.*;

public class KClosestNumbers {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[1]-a[1]);
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k ) pq.add(new int[]{arr[i],Math.abs(x-arr[i])});
            else {
                if (Math.abs(pq.peek()[0] - x) > Math.abs(arr[i] - x)) {
                    pq.poll();
                    pq.add(new int[]{arr[i],Math.abs(arr[i] - x)});
                }
            }
        }

        List<Integer> l = new ArrayList<Integer>();
        while(!pq.isEmpty()){

            l.add(pq.poll()[0]);
        }

        Collections.sort(l);

        return l;
    }
}
