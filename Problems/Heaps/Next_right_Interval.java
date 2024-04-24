package Java.Problems.Heaps;

import java.util.PriorityQueue;

public class Next_right_Interval {

    /*
    * https://leetcode.com/problems/find-right-interval/solutions/1544529/java-2-heaps-intuition-easy-to-understand/
    *
    * */
    public int[] findRightInterval(int[][] intervals) {

        PriorityQueue<int[]> minstart = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        PriorityQueue<int[]> minend = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        int[] result = new int[intervals.length];


        for(int i=0; i<intervals.length;i++){
            minstart.add(new int[]{intervals[i][0],i});
            minend.add(new int[]{intervals[i][1],i});
        }

       // Initilize result with -1
        for(int i=0; i<result.length;i++){
            result[i]=-1;
        }

        while(!minend.isEmpty()){

            int[] curr = minend.poll();
            int currVal = curr[0];
            int curIdx = curr[1];

            while(!minstart.isEmpty() && minstart.poll()[0]<currVal) minstart.poll();

           if(minstart.isEmpty()) return result;

           result[curIdx] = minstart.peek()[1];

        }

        return result;
    }
}
