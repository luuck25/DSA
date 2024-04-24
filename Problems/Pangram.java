package Java.Problems;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
     panGram("abcs");
    }

    public static boolean panGram(String str){
        Set<Character> pan = new HashSet<>();

        for(char cha : str.toLowerCase().toCharArray() ){
        if(Character.isLetter(cha))  pan.add(cha);
        }

     return pan.size()==26;
    }

}
