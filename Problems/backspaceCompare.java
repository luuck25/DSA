package Java.Problems;

public class backspaceCompare {

    public static void main(String[] args) {

        backspaceCompare("xywrrmp","xywrrmu#p");
    }
// str1="xp#", str2="xyz##"

    /**
     *  by using 2 loops and new array it will take o(n) space so 2 pointer is better which will take 0(1)
     * iterate both strings from end
     * find valid character othr then # and compare till string length
     *
     * https://www.youtube.com/watch?v=ZnIJob4nSEw
     * https://github.com/niteshnanda02/Leetcode/blob/master/844-backspace-string-compare/844-backspace-string-compare.java
     */

    public static boolean backspaceCompare(String s, String t) {

        int indexofs = s.length()-1;
        int indexoft = t.length()-1;
        int backSpace=0;
        int backSpace1=0;

        while(indexofs>=0 || indexoft >=0)
        {
            while(indexofs>=0)
            {
                if(s.charAt(indexofs)=='#'){ // backspace char
                    backSpace++;
                    indexofs--;
                }
                else if (backSpace>0){  // a non back space character
                    backSpace--;
                    indexofs--;
                }
                else
                {
                    break;
                }

            }
            while(indexoft>=0)
            {
                if(t.charAt(indexoft)=='#'){
                    backSpace1++;
                    indexoft--;
                }
                else if (backSpace1>0){
                    backSpace1--;
                    indexoft--;
                }
                else
                {
                    break;
                }
            }

            if(indexofs < 0 && indexoft < 0) return true; // reached end of both strings
            if( indexofs <0 || indexoft < 0) return false; // reached end of one string
            if(s.charAt(indexofs)!=t.charAt(indexoft)) return false;

            indexofs--;
            indexoft--;
        }
        return true;
    }


}
