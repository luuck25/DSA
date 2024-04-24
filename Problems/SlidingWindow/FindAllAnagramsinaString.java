package Java.Problems.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsinaString {

    public static void main(String[] args) {

    }
/*
* extended version of permutation program
* Instead of flag store indices
* */
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        char[] arr1 = p.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : arr1) map.put(c, map.getOrDefault(c, 0) + 1);
        char[] arr = s.toCharArray();

        int windowStart = 0;
        int matched =0;

        for(int windowEnd=0; windowEnd<arr.length;windowEnd++)
        {
            if(map.containsKey(arr[windowEnd])){
                map.put(arr[windowEnd],map.get(arr[windowEnd])-1);
                if(map.get(arr[windowEnd])==0) matched++;
            }

            if(matched== map.size()) list.add(windowStart);

            if(windowEnd-windowStart+1 > p.length()-1 )
            {
                if(map.containsKey(arr[windowStart])) {
                    if(map.get(arr[windowStart])==0)  matched--;
                    map.put(arr[windowStart],map.get(arr[windowStart])+1);
                }
                windowStart++;

            }

        }
       return list;
    }
}
