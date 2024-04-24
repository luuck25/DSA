package Java.Problems.CyclicSort;

public class DuplicateNumber {

    public static void main(String[] args) {

        findDuplicate(new int[]{1,3,4,2,2});
    }

    public static int findDuplicate(int[] nums) {

        int i=0;
        int duplicate= 0;
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
        * Sort as per same problem of all missing number
        *
        * and return number on that place
        *
        * */
        for(int j=0; j<nums.length;j++){

         if(j+1!=nums[j]) duplicate=nums[j];

        }

        return duplicate;
    }
}
