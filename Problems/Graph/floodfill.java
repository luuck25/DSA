package Java.Problems.Graph;

public class floodfill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int currentCol = image[sr][sc];

        dfsfill(image,sr,sc,currentCol,color);

       return image;
    }

    public void dfsfill(int[][] image,int sr,int sc,int cuRcolor,int color){


        if(sr<0 || sc<0 || sr>= image.length || sc >= image[sr].length || image[sr][sc]!=cuRcolor ||  image[sr][sc] == color) return;
        image[sr][sc]=color;
        dfsfill(image,sr+1,sc,cuRcolor,color);
        dfsfill(image,sr-1,sc,cuRcolor,color);
        dfsfill(image,sr,sc+1,cuRcolor,color);
        dfsfill(image,sr,sc-1,cuRcolor,color);
    }
}
