package Java.Problems.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }

    public String minWindow(String s, String t) {


        char[] arr1 = t.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : arr1) map.put(c, map.getOrDefault(c, 0) + 1);
        char[] arr = s.toCharArray();

        int windowStart = 0;
        int matched =0;
        int minLen=s.length()+1;
        int substrStart=0;

        for(int windowEnd=0; windowEnd<arr.length;windowEnd++)
        {
            if(map.containsKey(arr[windowEnd])){
                map.put(arr[windowEnd],map.get(arr[windowEnd])-1);
                if(map.get(arr[windowEnd])>=0) matched++;
            }

            while(matched==t.length()){

                if(minLen> windowEnd-windowStart+1){
                    minLen = windowEnd-windowStart+1;
                    substrStart=windowStart;
                }


                char c= arr[windowStart++];
                if(map.containsKey(c)){
                    if(map.get(c)==0) matched--;
                    map.put(c,map.get(c)+1);
                }
            }

        }
        return minLen>s.length()? "":s.substring(substrStart,minLen);

    }
}
