package Java.Problems;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    /*
    *
    * https://github.com/MAZHARMIK/Interview_DS_Algo/blob/master/HashMap/Number%20of%20Good%20Pairs.cpp
    *
    * Hash set problem - approach 3 (https://www.youtube.com/watch?v=RSu9uQ-OGb0)
    *
    *  Time complexity O(n) - 1 time traversing
    *  Space complexity o(1)
    *
    * */
    public static void main(String[] args) {
        System.out.println(goodPairs(new int[]{1,2,3}));
    }

    public static int goodPairs(int[] arr)
    {
        int num_pairs=0;
        Map<Integer,Integer> mp= new HashMap<>();
       for(int num:arr){
           num_pairs+= mp.getOrDefault(num,0);
           mp.put(num,mp.getOrDefault(num,0)+1);
       }
        return num_pairs;

    }
}
