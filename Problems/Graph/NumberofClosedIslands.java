package Java.Problems.Graph;

public class NumberofClosedIslands {

    /**
     * https://www.youtube.com/watch?v=dMn6NPk9nPw
     * https://leetcode.com/problems/number-of-closed-islands
     *
     * time com - O(m*n) - visiting each cell once
     * */

    public int closedIsland(int[][] grid) {

        int result=0;

        for(int i=0;i< grid.length;i++){

            for(int j=0; j<grid[i].length;j++){

                if(grid[i][j]==0){

                    if(closedIsland(grid,i,j)) result++;

                }


            }

        }
    return result;
    }

    public Boolean closedIsland(int[][] grid,int i,int j){

        if(i<0 || j<0 || i>= grid.length || j >= grid[i].length ) return false;

        if(grid[i][j]==1) return true;
        grid[i][j]=1;
        boolean down=closedIsland(grid,i+1,j);
        boolean up=closedIsland(grid,i-1,j);
        boolean right=closedIsland(grid,i,j+1);
        boolean left=closedIsland(grid,i,j-1);

        return down && up && right && left;
    }
}
