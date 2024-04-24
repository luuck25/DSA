package Java.Problems.Graph;

public class numIslands {

    // https://leetcode.com/problems/number-of-islands/solutions/2497954/java-easy-solution-98-faster-code/

    //*  https://leetcode.com/problems/number-of-islands/
    // Time complexity:
    //O(m*n). m and n are lengths of rows and columns respectively.
    //
    //Space complexity:
    //O(m*n) because of recursion stack used .m and n are lengths of rows and columns respectively.
    // */
    public int numIslands(char[][] grid) {
        int result=0;
        for(int row=0;row<grid.length;row++){

            for(int column=0;column<grid[row].length;column++){

               if(grid[row][column]=='1'){
                   result++;
                   dfs(grid,row,column);

               }
            }

        }
        return result;
    }
    public void dfs(char[][] grid,int i,int j){

        if(i<0 || j<0 || i>= grid.length || j>= grid[i].length || grid[i][j]=='0') return;

        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return;
    }
}
