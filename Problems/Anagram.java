package Java.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("anagram","nagaram"));

    }

    public static boolean anagram(String str,String str1)
    {
        Map<Character,Integer> m1 = new HashMap<>();
       for(int i=0; i<str.length();i++){
           char ch = str.charAt(i);
           m1.put(ch, m1.getOrDefault(ch, 0) + 1);
       }
        for(int i=0; i<str1.length();i++){
            char ch = str1.charAt(i);
            if(m1.containsKey(ch)) m1.put(ch,m1.get(ch)-1);
        }

       Set<Character> mapKeys = m1.keySet();
        for(Character key : mapKeys){
            if(m1.get(key)!=0) return false;
        }

        return true;
    }
}
