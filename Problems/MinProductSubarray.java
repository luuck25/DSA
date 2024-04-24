package Java.Problems;

public class MinProductSubarray {

    public static long findMinProduct(int n, int[] a) {

        int countZero=0;
        int countNeg=0;
        int product=1;
        int Negmax=Integer.MIN_VALUE;
        int posMin=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {

            if(a[i]==0)
            {
                countZero++;
                continue;
            }

            if(a[i]<0)
            {
                Negmax=Math.max(Negmax,a[i]);
                countNeg++;
            }

            if(a[i]>0 && a[i]<posMin)
            {
                posMin=a[i];
            }

            product=product*a[i];
        }

        if(countZero==n || countNeg==0 && countNeg>0)
            return 0;

        if (countNeg == 0 && countZero==0)
            return posMin;

        if (countNeg % 2 == 0 && countNeg != 0) {

            // Otherwise result is product of
            // all non-zeros divided by maximum
            // valued negative.
            product = product / Negmax;
        }

        return product;
    }


    public static void main(String[] args) {
        findMinProduct(69,new int[]{7,-2,7,-1,2,-3,-10,-2,-9,6,-5,-10,9,4,-5,6,0,2,-10,-5,-6,1,-6,6,-3,7,7,-9,-10,-4,-9,4,9,10,3,-7,-6,6,3,7,-3,-2,-10,-2,10,-3,-9,0,7,-1,-3,5,-5,-4,-3,2,3,2,-7,-8,9,10,10,2,4,2,-8,2,-3});
    }
}
