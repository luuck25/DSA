package Java.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {

        fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue; //skip same elements
            for (int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue; //skip same elements
                int start=j+1;
                int end= nums.length-1;
                while(end>start)
                {
                    int sum = nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum==target)
                    {
                        quadruplets.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;
                        while(end>start && nums[start] == nums[start-1]) start++; //skip same elements
                        while(end>start && nums[end] == nums[end+1]) end--; //skip same elements
                    }
                    else if (sum < target) start++;
                    else end--;
                }
            }
        }
        return quadruplets;
    }

}
