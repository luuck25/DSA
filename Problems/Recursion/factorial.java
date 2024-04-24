package Java.Problems.Recursion;

public class factorial {

    public static void main(String[] args) {


        System.out.println(fact(5));

    }

    private static int fact(int n) {
        if(n==1){
            return 1;
        }
      return n * fact(n-1);


      //  5 * fact(4)
        //      4 * fact(3
        // 3 * fact(2)
        // 2 * fact(1) = 2* 1



    }
}
