package Java.Problems.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {

    public static void main(String[] args) {
 findDisappearedNumbers(new int[]{2, 3, 1, 8, 2, 3, 5, 1});


    }
 /*
 * similar to missing number but here length is complete
 *
 * so while sort we will exist of nums[i] = nums[nums[i]-1] (1,2,3,1,2,3,5,8)
 *
 * t - o(n)
 * s - o(1)
 * */

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i< nums.length )
        {
            while(nums[i]!= nums[nums[i]-1]){

                int index = nums[i]-1;
                int tmp = nums[i];
                nums[i]=nums[index];
                nums[index]= tmp;

            }
            i++;
        }

        List<Integer> ll = new ArrayList<>();

        for(int j=0;j<nums.length;j++){

            if(j+1!=nums[j])
            {

                System.out.println(j+1);
                ll.add(j+1);


            }
        }


 return ll;
    }
}
