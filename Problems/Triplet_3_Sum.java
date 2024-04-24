package Java.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Triplet_3_Sum {
    public static void main(String[] args) {

    }

    public static int threeSum(int[] nums) {

        if(nums.length<3) return 0;
        Arrays.sort(nums);
        HashSet<List<Integer>> triplets = new HashSet<>();

      //  Arrays.asList(triplets.iterator());

        for(int i=0; i<=nums.length-2;i++){
            int start = i+1;
            int end = nums.length -1;

            while(end>start) {
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                }
                else if (sum<0) start++;
                else end--;
            }
        }
        return triplets.size();
    }
}
