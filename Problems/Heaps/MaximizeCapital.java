package Java.Problems.Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaximizeCapital {

    /*
    * https://leetcode.com/problems/ipo/solutions/3220314/detailed-solution-with-steps/
    *
    * https://www.youtube.com/watch?v=BvqLGX8Fxb0
    *
    * time com - O(nlogn)
    * */
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

    // create a pair of profit and capital
         int n = profits.length;
        List<int[]> projects = new ArrayList<>();

        for(int i=0; i<n;i++){
           projects.add(new int[]{capital[i],profits[i]});
        }

        //sort as per captial

        projects.sort((a,b)-> a[0]-b[0]);

        // define pq to store profits

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i=0;

        while (k >0){
            // // While i is less than n and the minimum capital requirement of
            // the current project is less than or equal to w
            while(i<n && projects.get(i)[0] <=w){
                pq.add(projects.get(i)[1]);
                i++;
            }
            // If the priority queue is empty, break out of the loop because we can't afford any more projects
            if(pq.isEmpty()) break;
            w+= pq.poll();
            k--;
        }

        return w;

    }
}
