package Java.Problems.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public String frequencySort(String s) {


        Map<Character,Integer> mp = new HashMap<>();

        for(char c:s.toCharArray()) {mp.put(c,mp.getOrDefault(c,0)+1);}

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b)-> mp.get(b)-mp.get(a));  //max heap

        for(char i : mp.keySet()){

            pq.add(i);

        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        char ch = ' ';
        while(!pq.isEmpty()){
            ch = pq.poll();
            count = mp.get(ch);
            while(count-- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
