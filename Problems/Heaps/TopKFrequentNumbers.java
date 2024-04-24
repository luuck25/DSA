package Java.Problems.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {


    /*
    * https://www.youtube.com/watch?v=7VoJn544QrM
    * */
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int num:nums) {mp.put(num,mp.getOrDefault(num,0)+1);}

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);

        for(int i : mp.keySet()){

            pq.add(new int[]{i,mp.get(i)});

            if(pq.size()>k) pq.poll();

        }

        int[] res = new int[k];

        int i=0;
        while(!pq.isEmpty()) res[i++]= pq.poll()[0];

        return res;
    }
}
