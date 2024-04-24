package Java.Problems.MergeIntervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {

    public static void main(String[] args) {

        int[][] d = {{2,4},{3,6},{4,5}};

        minMeetingRooms(d);
    }

    /*
    * https://interviewing.io/questions/meeting-rooms
    *
    * https://www.youtube.com/watch?v=bgZmJiPfkYE
    *
    * */
    public static int minMeetingRooms(int[][] meetings) {

        if(meetings.length==0) return 0;


        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        rooms.add(meetings[0][1]);
        for(int i=1;i<meetings.length;i++){

            int start= meetings[i][0];
            int end = meetings[i][1];

            if(rooms.peek() <= start){
                rooms.poll();
            }

            rooms.add(meetings[i][1]);

        }


  return rooms.size();


    }
}
