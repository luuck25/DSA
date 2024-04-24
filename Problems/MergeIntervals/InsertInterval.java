package Java.Problems.MergeIntervals;

import java.util.ArrayList;

public class InsertInterval {

    /*
    * https://leetcode.com/problems/insert-interval/solutions/3056665/leetcode-the-hard-way-explained-line-by-line/
    *https://www.youtube.com/watch?v=NWM4e4yda0w
    *
    * t - o(n)
    * s - o(n)
    * */
    public int[][] insert(int[][] intervals, int[] newInterval) {

        // Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        // Output: [[1,5],[6,9]]

        ArrayList<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval[0] > interval[1]) result.add(interval); // new interval is after existing interval
            else if (newInterval[1] < interval[0]) {  // new interval is first interval
                result.add(newInterval);
                newInterval = interval;
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);

            }
        }

        result.add(newInterval); // add last interval


        return result.toArray(new int[result.size()][]);

    }
}

