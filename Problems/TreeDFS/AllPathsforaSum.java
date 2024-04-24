package Java.Problems.TreeDFS;

import java.util.ArrayList;
import java.util.List;

public class AllPathsforaSum {

    public class TreeNode { int val;TreeNode left;TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        getList(root,targetSum,ll,l);
        return ll;

    }



    public static void getList(TreeNode currNode, int targetSum,List<List<Integer>> allPaths,List<Integer> currentPath){

     if(currNode==null) return;
     currentPath.add(currNode.val);
     if(currNode.left==null && currNode.right==null && currNode.val==targetSum)   {

         allPaths.add(new ArrayList<Integer>(currentPath));

     }else
     {
         getList(currNode.left, targetSum- currNode.val,allPaths,currentPath);
         getList(currNode.right, targetSum- currNode.val,allPaths,currentPath);
     }

       currentPath.remove(currentPath.size()-1);

    }
}
