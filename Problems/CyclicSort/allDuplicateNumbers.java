package Java.Problems.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class allDuplicateNumbers {

    public static void main(String[] args) {

        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDuplicates(int[] nums) {

        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<nums.length) {
            while (nums[i] != nums[nums[i] - 1]) {

                int tmp = nums[i];
                int index = nums[i]-1;

                nums[i]= nums[index];
                nums[index]= tmp;

            }
            i++;
        }
// after sort 1,2,3,4,2

        /*
         * Sort as per same problem of duplicate number
         *
         * Just add in array instead of variable
         *
         * */
        for(int j=0; j<nums.length;j++){

            if(j+1!=nums[j]) list.add(nums[j]);

        }

        return list;

    }
}
