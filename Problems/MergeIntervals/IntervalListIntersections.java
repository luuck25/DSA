package Java.Problems.MergeIntervals;

import java.util.ArrayList;

public class IntervalListIntersections {

    public static void main(String[] args) {
    // intervalIntersection({{0,2},{5,10},{13,23},{24,25}},)

        int[][] d = {{0,2},{5,10},{13,23},{24,25}};
        int[][] d1 = {{1,5},{8,12},{15,24},{25,26}};

        intervalIntersection(d,d1);
     }

     /*
     * https://www.youtube.com/watch?v=Qh8ZjL1RpLI&t=204s
     *
     * t - o(n+m) iterate both arrays
     *
     * */
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> result = new ArrayList<>();


        int j=0;
        int i=0;

       while(i<firstList.length && j<secondList.length){

           if(secondList[j][1] >= firstList[i][0] && firstList[i][1]>= secondList[j][0] ||
                   firstList[i][1] >= secondList[j][0] && secondList[j][1]>= firstList[i][0]  // check if both intervals intersect
           ){

               result.add(new int[]{(Math.max(firstList[i][0],secondList[j][0])),Math.min(firstList[i][1],secondList[j][1])});  // max of first and min of second

           }

           if(firstList[i][1]>secondList[j][1]) j++;
           else i++;

       }
 return result.toArray(new int[result.size()][]);

    }
}
