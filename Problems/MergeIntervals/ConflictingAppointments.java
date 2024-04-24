package Java.Problems.MergeIntervals;

import java.util.Arrays;

public class ConflictingAppointments {


    public int maxEvents(int[][] events) {

        Arrays.sort(events,(a,b)-> Integer.compare(a[0],b[0]));
        int count=0;
        for(int i=1; i < events.length;i++){

            if(events[i][0] > events[i-1][1]) count++;

        }

        return count;

    }
}
