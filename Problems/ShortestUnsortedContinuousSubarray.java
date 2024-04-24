package Java.Problems;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {

        findUnsortedSubarray(new int[]{1,2,4,3,0,18});
    }


    public static int findUnsortedSubarray(int[] nums) {

        int start=0;
        int end=nums.length-1;

        while(start < nums.length-1 && nums[start]<=nums[start+1]) start++;

        if(start==nums.length-1) return 0;
        while(end > 0 && nums[end]>=nums[end-1]) end--;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=start;i<=end;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        while(start >0 && nums[start-1]>min) start--;
        while(end < nums.length-1 && nums[end+1]<max) end++;

        int len = end -start+1;
        return len;

    }
}

