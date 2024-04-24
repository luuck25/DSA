package Java.Problems.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {

    }
    /**
     *
     * https://leetcode.com/problems/merge-intervals/solutions/2617501/detailed-easy-to-understand-beginner-friendly-java-solution/
     *
     * time com - o(n logn) {sort} + o(n) {traverse array} -> 0(n)
     *
     *space - o(n)
     */


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){

            if(result.size()==0) result.add(interval); // store first array
            else
            {
                int[] prevInterval = result.get(result.size()-1); // get prev array interval

                if(interval[0]<=prevInterval[1])   {  // start of next interval is less than end of earlier interval
                    prevInterval[1] = Math.max(interval[1],prevInterval[1]); //set end of first interval maximum of both
                }
                else
                {
                    result.add(interval);
                }
            }
        }


      return  result.toArray(new int[result.size()][]);

    }


}
