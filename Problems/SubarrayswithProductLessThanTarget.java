package Java.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayswithProductLessThanTarget {

    public static void main(String[] args) {

        maxSubArray(new int[]{2, 5, 3, 10},30);
    }

    public static List<List<Integer> > maxSubArray(
            int[] arr, int K)
    {
        // Store the required subarrays
        List<List<Integer> > solution = new ArrayList<>();

        int multi = 1;
        int start = 0;

        // Check for empty array
        if (arr.length <= 1 || K < 0) {
            return new ArrayList<>();
        }

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate product
            multi = multi * arr[i];

            // If product exceeds K
            while (multi > K) {

                // Reduce product
                multi = multi / arr[start];

                // Increase starting index
                // of current subarray
                start++;
            }

            // Stores the subarray elements
            List<Integer> list = new ArrayList<>();

            // Store the subarray elements
            for (int j = i; j >= start; j--) {

                list.add(0, arr[j]);

                // Add the subarrays
                // to the list
                solution.add(new ArrayList<>(list));
            }
        }

        // Return the final
        // list of subarrays
        return solution;
    }

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
            List<List<Integer>> result = new ArrayList<>();
        // TODO: Write your code here


        for(int i=0;i<=arr.length-1;i++){
            int product=1;
            int j=i;
            List<Integer> prodList = new ArrayList<>();
            while(j<=arr.length-1 && product< target)
            {
                product=arr[j]*product;
                if(product<target)
                {
                    prodList.add(arr[j]);
                    result.add(new ArrayList<>(prodList));
                }
                else break;
                j++;
            }
        }
        return result;
    }


}
