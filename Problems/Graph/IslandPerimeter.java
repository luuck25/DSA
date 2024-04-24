package Java.Problems.Graph;

public class IslandPerimeter {

    /*
    * https://www.youtube.com/watch?v=UcEYCLPWREQ&t=15s
    * time com - O(m*n)
    * */

    int result=0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i< grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    Perimeter(grid,i,j);
                }
            }
        }
        return result;
    }

    public void Perimeter(int[][] grid,int i,int j){

        if(i<0 || j<0 || i>= grid.length || j >= grid[i].length || grid[i][j]==0){ //boundary mean water as its all surrounded by water
            result++ ;
            return;
        }
        if(grid[i][j]==-1) return;

        grid[i][j]=-1; //mark visited as -1
        Perimeter(grid,i,j+1);
        Perimeter(grid,i,j-1);
        Perimeter(grid,i+1,j);
        Perimeter(grid,i-1,j);
    }

}
