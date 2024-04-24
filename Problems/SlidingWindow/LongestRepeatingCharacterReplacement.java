package Java.Problems.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        characterReplacement("AABABBA",1);

    }
// aabccbb
    public static int characterReplacement(String s, int k) {

     int windowStart=0;
     int maxLen =0;
     int maxFreq=0;
        HashMap<Character,Integer> freqMap = new HashMap<>();
     for(int windowEnd=0;windowEnd<s.length();windowEnd++){

         freqMap.put(s.charAt(windowEnd), freqMap.getOrDefault(s.charAt(windowEnd),0)+1);
             maxFreq = Math.max(maxFreq,freqMap.get(s.charAt(windowEnd)));
             if(windowEnd-windowStart+1-maxFreq>k){
                 freqMap.put(s.charAt(windowStart),freqMap.get(s.charAt(windowStart))-1);
                 windowStart++;
             }

             maxLen = Math.max(maxLen,windowEnd-windowStart+1);

     }
        return maxLen;
    }
}
