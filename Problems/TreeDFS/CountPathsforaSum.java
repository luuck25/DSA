package Java.Problems.TreeDFS;

import java.util.HashMap;
import java.util.HashSet;

public class CountPathsforaSum {
    int count=0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    /*
    * https://leetcode.com/problems/path-sum-iii/solutions/4274495/beats-100-00-of-users-with-java-easy-dfs-code-o-n-tc-with-explanation/
    *
    * https://www.youtube.com/watch?v=yyZA4v0x16w
    * //The time complexity of this code is O(n), where n is the number of nodes in the tree. This is because we need to visit each node in the tree once.
    *
    * The space complexity of this code is O(n), where n is the number of nodes in the tree. This is because we need to store the prefix sums in the hash table.
    * */

    public static void main(String[] args) {

    }
    public int pathSum(TreeNode root, int targetSum) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        getcountPath(root,targetSum,0,hm);

        return count;
    }

    public void getcountPath(TreeNode currNode, int targetSum, int currSum,HashMap<Integer,Integer> hm){

        // base case
        if(currNode==null) return;

        currSum+=currNode.val;


        // If map contains a sum equal to (prefixSum - targetSum), we need to increment count that many times
        if(hm.containsKey(currSum-targetSum)) count+=hm.get(currSum-targetSum);

        // There can be cases when the prefixSum is directly equal to targetSum, we need to increment count

        if(currSum==targetSum && targetSum!=0) count++;

        // Update the currSum till current node and it's count
        hm.put(currSum,hm.getOrDefault(currSum,0)+1);

        // Recurse
        getcountPath(currNode.left,targetSum,currSum,hm);
        getcountPath(currNode.right,targetSum,currSum,hm);

        // backtrack
        hm.put(currSum,hm.get(currSum)-1);

    }

}
