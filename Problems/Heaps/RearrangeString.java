package Java.Problems.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {

    /*
    * https://www.youtube.com/watch?v=_M-HcSlcfgg
    *
    *https://leetcode.com/problems/reorganize-string/solutions/3947780/100-2-approaches-priority-queue-sort
    *
    * time - O(nlogk)
    * space - O(n)
    * */

    // similar problem https://github.com/varunu28/LeetCode-Java-Solutions/blob/master/Hard/Rearrange%20String%20k%20Distance%20Apart.java

    // at k distance

    public String reorganizeString(String s) {

        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)-> mp.get(b)- mp.get(a));
        pq.addAll(mp.keySet());

        StringBuilder sb = new StringBuilder();
        while(pq.size()>1){

            char char1 = pq.poll();
            char char2  = pq.poll();

            sb.append(char1);
            sb.append(char2);

            mp.put(char1,mp.get(char1)-1);
            mp.put(char2,mp.get(char2)-1);

            if(mp.get(char1)> 0 ) pq.add(char1);
            if(mp.get(char2)> 0 ) pq.add(char2);

        }

        if(!pq.isEmpty()){

            char ch = pq.poll();
            if(mp.get(ch)>1) return "";
            sb.append(ch);
        }

    return sb.toString();

    }
}
