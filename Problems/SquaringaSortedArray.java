package Java.Problems;

import java.util.Arrays;
/*
*
* 2 pointer problem
* https://leetcode.com/problems/squares-of-a-sorted-array/solutions/1467196/INTUITION-or-JAVA-or-TWO-POINTER-or-PLOTS-or-VISUALIZATION/
* https://www.youtube.com/watch?v=fikdT0AI5z4
*
* */
public class SquaringaSortedArray {
    public static void main(String[] args) {
        int[] arr = Square(new int[]{-2, -1, 0, 2, 3});
        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }

    public static int[] Square(int[] arr) {

        int[] targetArray= new int[arr.length];
        int index = arr.length-1;
        int start = 0;
        int end = arr.length-1;

        while(end>=start)
        {
            int startSQ = arr[start] * arr[start];
            int endSQ = arr[end] * arr[end] ;

            if (endSQ> startSQ){
                targetArray[index--]= endSQ;
                end--;
            }
            else {
                targetArray[index--] = startSQ;
                start++;
            }
        }
       return targetArray;
    }
}


