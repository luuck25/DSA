package Java.Problems.Subsets;

import java.util.ArrayList;
import java.util.List;

public class allSubsets {

    public static void main(String[] args) {
        subsets(new int[]{1,5,3});
    }
/*  BFS
* https://leetcode.com/problems/subsets/solutions/375415/java-breadth-first-search/
* time - Since, in each step, the number of subsets doubles as we add each element to all the existing subsets,
* the time complexity of the above algorithm is O(2^n)
*
* space- O(2^n)
*
* */
    public static  List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> allsubsets = new ArrayList<>();
        allsubsets.add(new ArrayList<>());

        for(int i=0; i< nums.length;i++){

            List<List<Integer>> newList = new ArrayList<>();

            for(int n=0; n< allsubsets.size();n++){

                List<Integer> c = new ArrayList<>(allsubsets.get(n));

                c.add(nums[i]);

                newList.add(c);

            }

            allsubsets.addAll(newList);

        }

    return allsubsets;
    }
}
