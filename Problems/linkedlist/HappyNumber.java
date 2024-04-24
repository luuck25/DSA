package Java.Problems.linkedlist;

public class HappyNumber {

    public static void main(String[] args) {

    }
/*
* https://leetcode.com/problems/happy-number/solutions/3767573/easy-java-solution-two-pointers-floyd-s-tortoise-and-hare-detailed-explanation/
* https://www.youtube.com/watch?v=ocDwEjRVDAk
*
* time - o(n)
* space - o(1)
*
* */
    public static  int getSquare(int n){

        int ans=0;
        while(n>0){
            int remainder = n%10;
            ans+=remainder*remainder;
            n/=10;
        }

        return ans;
    }

    public boolean isHappy(int n) {

       int slow=n;
       int fast=n;

       do {
           slow=getSquare(slow);
           fast=getSquare(getSquare(fast));
       }
       while(slow !=fast);

        return slow==1;
    }

}
