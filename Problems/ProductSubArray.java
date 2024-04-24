package Java.Problems;

public class ProductSubArray {

    public static long findMaxProduct(int n, int[] a) {

        // code here

        if (n == 1) {
            return a[0];
        }

        // Find count of negative numbers, count
        // of zeros, negative number
        // with least absolute value
        // and product of non-zero numbers
        int max_neg = Integer.MIN_VALUE;
        int count_neg = 0, count_zero = 0;
        long prod = 1;
        for (int i = 0; i < n; i++) {

            // If number is 0, we don't
            // multiply it with product.
            if (a[i] == 0) {
                count_zero++;
                continue;
            }

            // Count negatives and keep
            // track of negative number
            // with least absolute value.
            if (a[i] < 0) {
                count_neg++;
                max_neg = Math.max(max_neg, a[i]);
            }

            prod = prod * a[i];
        }

        // If there are all zeros
        if (count_zero == n) {
            return 0;
        }

        // If there are odd number of
        // negative numbers
        if (count_neg % 2 == 1) {

            // Exceptional case: There is only
            // negative and all other are zeros
            if (count_neg == 1
                    && count_zero > 0
                    && count_zero + count_neg == n) {
                return 0;
            }

            // Otherwise result is product of
            // all non-zeros divided by
            //negative number with
            // least absolute value.
            prod = prod / max_neg;
        }
        System.out.println("prod s "+prod);
        return prod;
    }



    public static void main(String[] args) {
        findMaxProduct(69,new int[]{7,-2,7,-1,2,-3,-10,-2,-9,6,-5,-10,9,4,-5,6,0,2,-10,-5,-6,1,-6,6,-3,7,7,-9,-10,-4,-9,4,9,10,3,-7,-6,6,3,7,-3,-2,-10,-2,10,-3,-9,0,7,-1,-3,5,-5,-4,-3,2,3,2,-7,-8,9,10,10,2,4,2,-8,2,-3});
    }
}
