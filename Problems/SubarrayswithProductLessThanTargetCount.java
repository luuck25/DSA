package Java.Problems;

import java.util.ArrayList;
import java.util.List;

public class SubarrayswithProductLessThanTargetCount {


    /*
    * https://leetcode.com/problems/subarray-product-less-than-k/description/
    *
    * https://leetcode.com/problems/subarray-product-less-than-k/solutions/3226822/beats-95-java-code-beats-88-c-code/
    * */

    public static void main(String[] args) {

      //      maxSubArray(new int[]{2, 5, 3, 10},30);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int start = 0,end=0;
        int prod=1;
        int count=0;

        while(end<nums.length)
        {
            prod*=nums[end];
            while(prod>=k) prod/=nums[start++];
            count+=(end-start)+1;
            end++;
        }
        return count;

    }




}
