package Java.Problems.CyclicSort;

public class FindtheSmallestMissingPositiveNumber {

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(new int[]{-1,-3,0,1,2,4}));
    }

    public static int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){

/*
* ignore non negative and 0 numbers
* ignore number greater than array size
*
* t- o(n)
* s- o(1)
* */
            while(nums[i]>0 && nums[i]<= nums.length && nums[i]!=nums[nums[i]-1])
            {
                int index = nums[i]-1;
                int tmp = nums[i];

                nums[i] = nums[index];
                nums[index] = tmp;
            }

            i++;}

        for(int j=0; j<nums.length;j++){

            if(nums[j]!=j+1) return j+1;

        }

        return nums.length+1;
    }
}
