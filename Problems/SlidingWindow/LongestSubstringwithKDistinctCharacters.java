package Java.Problems.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringwithKDistinctCharacters {

    public static void main(String[] args) {

        longestSubstring("araaci",2);

    }

    public static int longestSubstring(String s, int k) {

        char[] arr = s.toCharArray();
         int len =0;
         int start=0;
// araaci
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(hm.size()<=k)  len++;
            else {

                if(hm.get(arr[start])<=1) hm.remove(arr[start]);
                else hm.put(arr[start],hm.getOrDefault(arr[start],0)-1);
                start++;

            }


        }


     return len;
    }
}
