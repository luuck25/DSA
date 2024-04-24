package Java.Problems.SlidingWindow;

import java.util.HashMap;

public class PermutationinaString {

    public static void main(String[] args) {

    }

    public static boolean checkInclusion(String s1, String s2) {

        char[] arr1 = s1.toCharArray();

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        char[] arr = s2.toCharArray();

        int windowStart = 0;
        int matched =0;

        for(int windowEnd=0; windowEnd<arr.length;windowEnd++)
        {
            if(map.containsKey(arr[windowEnd])){
                map.put(arr[windowEnd],map.get(arr[windowEnd])-1);
                if(map.get(arr[windowEnd])==0) matched++;
            }

            if(matched== map.size()) return true;

            if(windowEnd-windowStart+1 > s1.length()-1 )
            {
                if(map.containsKey(arr[windowStart])) {
                    if(map.get(arr[windowStart])==0)  matched--;
                    map.put(arr[windowStart],map.get(arr[windowStart])+1);
                }
                windowStart++;

            }

        }
  return  false;
    }
}
