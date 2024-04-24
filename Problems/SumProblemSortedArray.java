package Java.Problems;

import java.util.Arrays;

public class SumProblemSortedArray {


    public static void main(String[] args) {

        int[] arr=twoSum(new int[]{2, 7,11, 15},13);
        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }
 /*
 *
 *       using two pointer approach
 *       first pointer from start of array and 2nd from end of array
 *       if sum is more than target move element from right
 *      if sum is less than target then move element from left
 * */

    public static int[]  twoSum(int[] nums, int target) {

        int[] output= new int[2];
        int start=0;
        int end=nums.length-1;
        while(end>start)
        {
            if(nums[start]+nums[end]>target) end--;
            else if (nums[start]+nums[end]<target) start++;
            else
            {
                output[0]=start;
                output[1]=end;
                break;
            }


        }
        return output;
    }
}
