package Java.Problems;

public class DutchNationalFlagProblem {

    public static void main(String[] args) {

    }
/*

 Take 3 Pointers low = 0, mid = 0 and high = nums.length -1;
Use loop to iterate the array with condition mid <= high.(Since we only need to check middle elements of low and high).
if element is 0 swap with low and low++, mid++.
if element is 1 then mid++.
if element is 2 then swap with high and high--.
/
 */

    public void swap(int[] arr,int first,int second)
    {
        int temp= arr[first];
        arr[second]= arr[second];
        arr[second]=temp;
    }

    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
         switch(nums[mid]){

             case 0:
                 swap(nums,low,mid);
                 low++;
                 mid++;
                 break;
             case 1:
                 mid++;
                 break;
             case 2:
                 swap(nums,mid,high);
                 high--;
                 break;
         }
        }
    }




}


