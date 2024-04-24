package Java.Problems.SlidingWindow;

import java.util.HashMap;

public class MaximumSumSubarrayofSizeK {

    public static void main(String[] args) {

        distinctmaximumSubarraySum(new int[]{1,5,1,1,3,4},3);
    }
/*
*
* space -o(1)
* time - o(n)
*
* */
    public static long maximumSubarraySum(int[] nums, int k) {

        int windowStart=0;
        int maxSum=0;
        int windowSum=0;

        for(int windowEnd =0 ; windowEnd<nums.length;windowEnd++)
        {
            if(windowEnd < nums.length-1) {
                windowSum += nums[windowEnd];

            }
            // slide the window, we dont need to slide if we not have hit required size of window K
            if(windowEnd>k-1){
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= nums[windowStart]; // Substract the element
                windowStart++; // slide the window Ahead
            }

        }

        return  maxSum;
    }
    public static long distinctmaximumSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> mp =new HashMap<Integer,Integer>();

        int currentSum = 0, maxSum = 0;
        int n = arr.length, left = 0, i = 0;

        //Iterating for length k
        while(i < k && i < n) {
            currentSum += arr[i];
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i]) + 1);
            else
                mp.put(arr[i], 1);
            i++;
        }

        // If distinct elements present in map
        // equal to k
        if(mp.size() == k) {
            maxSum = currentSum;
        }

        //Iterating over the left array
        for( i = k; i < n; i++) {
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i]) + 1);
            else
                mp.put(arr[i] , 1);

            if(mp.containsKey(arr[left])) {
                mp.put(arr[left], mp.get(arr[left]) - 1);
                if(mp.get(arr[left]) <= 0) {
                    mp.remove(arr[left]);
                }

                currentSum += arr[i];
                currentSum -= arr[left];

                if(mp.size() == k) {
                    maxSum = Math.max(maxSum, currentSum);
                }

                left++;
            }

        }

        // Returning the maximum sum
        return maxSum;
    }
    }
