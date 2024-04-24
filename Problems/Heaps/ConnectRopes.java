package Java.Problems.Heaps;

import java.util.PriorityQueue;

public class ConnectRopes {


    /*
    * https://www.youtube.com/watch?v=_k_c9nqzKN0
    *
    * s - O(n)
    * t - O(nlogn)
    *
    * */
    public static long connectRopes(int[] arr)
    {
        //Write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : arr){
            pq.add(i);
        }

        int result=0;
        while(pq.size()>1)
        {

            int tmp = pq.poll()+pq.poll();
            result+=tmp;

            pq.add(tmp);

        }

        return result;
    }
}
