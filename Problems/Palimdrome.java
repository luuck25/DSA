package Java.Problems;
public class Palimdrome {
    public static void main(String[] args) {
        System.out.println(palindrome("Was it a car or a cat I saw?1"));
    }

    public static Boolean palindrome(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char currChar : charArray) {
            if (Character.isLetter(currChar) || Character.isDigit(currChar)) sb.append(currChar);
        }

        char[] palinArray = sb.toString().toCharArray();
        int start = 0;
        int end = palinArray.length - 1;
        while (end > start) {
            if (palinArray[start] != palinArray[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}