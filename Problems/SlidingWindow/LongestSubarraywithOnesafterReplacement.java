package Java.Problems.SlidingWindow;

public class LongestSubarraywithOnesafterReplacement {

    public static void main(String[] args) {

        longestOnes(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2);

    }

    // [0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1]

    public static  int longestOnes(int[] nums, int k) {

        int start = 0,maxlen = 0,freq=0;

        for(int windowEnd=0; windowEnd<nums.length;windowEnd++)
        {
            if(nums[windowEnd]==0) freq++;
            if(freq>k){
               if(nums[start]==0) freq--;
                start++;
            }

            maxlen= Math.max(maxlen,windowEnd-start+1);

        }

        return maxlen;

    }

}
