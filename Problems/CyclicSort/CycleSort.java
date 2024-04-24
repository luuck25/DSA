package Java.Problems.CyclicSort;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

   //     System.out.println(sort(new int[]{5,4,2,3,1}));

        Arrays.stream(sort(new int[]{5,4,2,3,1})).forEach(e-> System.out.println(e));
    }

    /*
    * https://www.youtube.com/watch?v=YvksaZhYYAk
    *
    * t - o(n)
    * s - o(1)
    * */
    public static int[] sort(int[] arr)
    {

        for(int i=0;i<arr.length;i++){

            // 3,5,6,1,4
            while(i!=arr[i]-1){

                int index = arr[i]-1;

                int tmp = arr[i];

                arr[i]= arr[index];
                arr[index] = tmp;


            }

        }

return arr;

    }
}
