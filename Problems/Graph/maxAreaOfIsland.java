package Java.Problems.Graph;

public class maxAreaOfIsland {
    int area =0;
    public static void main(String[] args) {


    }

    // same as number of islands , just logic is tweaked to count max area
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea=0;
        for(int row=0;row<grid.length;row++){
            for(int column=0;column<grid[row].length;column++){
                if(grid[row][column]==1){
                    area=0;
                    dfs(grid,row,column);
                    maxArea= Math.max(maxArea,area);
                }
            }

        }
        return maxArea;
    }

    public void dfs(int[][] grid,int i,int j){

        if(i<0 || j<0 || i>= grid.length || j>= grid[i].length || grid[i][j]==0)        return ;
        area++;
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
}
