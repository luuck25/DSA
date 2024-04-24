package Java.Problems;

import java.util.HashMap;

public class SumProblem {


    public static void main(String[] args) {

        twoSum(new int[]{2, 7, 4,11, 1},9);

    }
 /*
 *
 *          Approach is target or final number
 *          target - current index if in map then return pair
 *          else add in map
 *
 * */

    public static int[]  twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> mp= new HashMap<>();
        int[] output= new int[2];
        for (int i=0;i<nums.length;i++)
        {
          int diff= target-nums[i];
          if(mp.containsKey(diff))
          {
              output[0]=mp.get(diff);
              output[1]=i;
              break;
          }
          else mp.put(nums[i],i);
        }
        return output;
    }
}
