package Java.Problems;

import java.util.Arrays;

public class TripletswithSmallerSum {

    public static void main(String[] args) {

        System.out.println(searchTriplets(new int[]{-1, 0, 2, 3},3));
    }

/*
*
*
* time - o(n2)
* space - o(n)
*https://www.designgurus.io/course-play/grokking-the-coding-interview/doc/638f7a0a4544c65f117ba260
* https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
*
* */
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-2;i++)
        {
            int start= i+1;
            int end= arr.length-1;

            while(end> start)
            {
                int sum = arr[i]+arr[start]+arr[end];

                if(sum < target)
                {count+= (end-start);

                    // if 1,3,5,8,12,15,50 (target 20) - if 1,3,15 makes less than 20 then all pairs like
                    //  1,3,12 - 1,3,8 will make less than 20 so we did that end index - start index
                    start++;
                }
                else end--;
            }

        }

        return count;
    }
}
