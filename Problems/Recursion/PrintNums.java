package Java.Problems.Recursion;

public class PrintNums {

    public static void main(String[] args) {

        printNums(5);
    }

    public static void printNums(int n) {

        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNums(n-1);

    }
}
