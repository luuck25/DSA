package Java.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4,1};
        containsDuplicate(arr);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); // Use HashSet to store unique elements
        for (int x : nums) {
            if (!set.add(x)) // If the set already contains the current element, return true
                return true;
        }
        return false; // Return false if no duplicates found
    }
    public static boolean containsDuplicate1(int[] arr) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0; i<arr.length;i++){

            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        if (mp.containsValue(2)) return true;
        else return false;
    }

}
