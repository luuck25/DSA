package Java.Problems.CyclicSort;

public class MissingNumber {

    public static void main(String[] args) {

       // missingNumber(new int[]{0,1,4,3});
        AllmissingNumber(new int[]{2, 3, 1, 8, 2, 3, 5, 1});

    }
 /*
 * same as cyclic added extra condition of numbers should not exceed length as we have less length n-1
 * we can do sum way as well - sum of n numbers - sum of given number (https://www.youtube.com/watch?v=YRsy-pYAZ30)
 * t- o(n)
 * s -o(1)
 *
 * */
    public static void missingNumber(int[] nums) {

        int i=0;

        while(i<nums.length){

            while(nums[i]<nums.length && nums[i]!=i){
                int index = nums[i];
                int temp = nums[i];

                nums[i] = nums[index];
                nums[index]= temp;

            }
            i++;
        }

        for(int j=0; j<nums.length;j++){

            if(j!=nums[j]) System.out.println(j);

        }

    }
    public static void AllmissingNumber(int[] arr) {

        for(int i=0;i<arr.length;i++){

            // 3,5,6,1,4
            while(i!=arr[i]-1){

                int index = arr[i]-1;

                int tmp = arr[i];

                arr[i]= arr[index];
                arr[index] = tmp;


            }
            i++;

        }

        for(int j=0; j<arr.length;j++){

            if(j!=arr[j]) System.out.println(j);

        }

    }


}
