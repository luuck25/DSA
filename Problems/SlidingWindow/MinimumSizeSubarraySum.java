package Java.Problems.SlidingWindow;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

       minSubArrayLen(7,new int[]{2,3,1,2,4,3});
    }
/*
*https://www.youtube.com/watch?v=D2MbogiFXWU
* https://leetcode.com/problems/minimum-size-subarray-sum/solutions/3728554/simple-java-solution/
* Sliding window
* Iterate till u get sum > or equal to target
* Once target sum is there slide window to see if you can get less length slide window
* time - o(n)
* space - o(1)
* */
    public static int minSubArrayLen(int target, int[] nums) {

        int sum=0;
        int len=Integer.MAX_VALUE;
        int start=0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                len= Math.min(len,i-start+1);
                sum-=nums[start];
                start++;
                }
        }

        return len==Integer.MAX_VALUE ?0:len;
    }
}
