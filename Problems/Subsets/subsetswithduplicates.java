package Java.Problems.Subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class subsetswithduplicates {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        HashSet<List<Integer>> allsubsets = new LinkedHashSet<>();
        allsubsets.add(new ArrayList<>());

        for(int i=0; i< nums.length;i++){

            List<List<Integer>> newList = new ArrayList<>();

            for(int n=0; n< allsubsets.size();n++){

                allsubsets.

                List<Integer> c = new ArrayList((allsubsets.toArray()[n]));

                c.add(nums[i]);

                newList.add(c);

            }

            allsubsets.addAll(newList);

        }

        return allsubsets;
    }
}
