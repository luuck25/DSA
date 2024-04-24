package Java.Problems;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(reverse("DesignGUrus"));

    }
    public static String reverse(String str){
        int start=0;
        int end= str.length()-1;
        char[] strArray = str.toCharArray();
        Set<Character> vow = new HashSet<>();
        vow.add('a') ; vow.add('A');
        vow.add('e');   vow.add('E');
        vow.add('i');    vow.add('I');
        vow.add('o');     vow.add('O');
        vow.add('u');  vow.add('U');
        while(end>start)
        {
        if(vow.contains(strArray[start]) && vow.contains(strArray[end]) ) {
        char swap=   strArray[start];
        strArray[start]= strArray[end];
        strArray[end] = swap;
        start++;
        end--;
        }
        else if (vow.contains(strArray[start]) && ! vow.contains(strArray[end]) ) end--;
        else if (!vow.contains(strArray[start]) &&  vow.contains(strArray[end])) start++;
        else { start++; end--;}
        }

        return String.valueOf(strArray);
    }


}
