package Java.Problems.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class distinctIslands {

/*
* https://www.youtube.com/watch?v=7zmgQSJghpo - logic
* https://www.youtube.com/watch?v=y6UmfBMjJKc  - code
* */

    int countDistinctIslands(int[][] grid) {
        // Your Code here

        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i< grid.length;i++){
            for(int j=0; j<grid[i].length;j++){

                if(grid[i][j]==1){
                List<Integer> ll = new ArrayList<>();
                island(grid,i,j,i,j,ll);
                result.add(ll);
                }
            }
        }

        return result.size();
    }

    public void island(int[][] grid, int i, int j,int basex, int basey,List<Integer> ll){

        if(i<0 || j<0 || i>=grid.length || j >= grid[i].length || grid[i][j]==0) return;
        grid[i][j]=0;
        ll.add(i-basex);
        ll.add(j-basey);
        island(grid, i, j+1, basex, basey, ll);
        island(grid, i, j-1, basex, basey, ll);
        island(grid, i+1, j, basex, basey, ll);
        island(grid, i-1, j, basex, basey, ll);

    }
}
