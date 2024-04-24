package Java.Problems;

import java.util.Arrays;
public class TripletNearSum {

    public static void main(String[] args) {

    }
 /*
 * https://leetcode.com/problems/3sum-closest/
 * time - o(n2)
 * space - o(n)
 *
 * */
    public static int nearSum(int[] nums,int target)
    {
        if(nums.length<3) return 0;
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for(int i=0; i<=nums.length-2;i++){
            int start = i+1;
            int end = nums.length -1;

            while(end>start) {
                int sum = nums[i]+nums[start]+nums[end];
                if(sum== target) return sum;
                if(Math.abs(sum-target) < Math.abs(closestSum - target)) closestSum=sum;
               if(sum< target) start++;
               else end--;
            }
        }
        return closestSum;
    }
}
