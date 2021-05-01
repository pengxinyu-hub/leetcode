public class solution733 {
    int[] posX={-1,1,0,0};
    int[] posY={0,0,1,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] marked=new boolean[image.length][image[0].length];
        dfs(image,sr,sc,newColor,image[sr][sc],marked);
        return image;
    }

    private void dfs(int[][] image,int sr,int sc,int newColor,int oldColor,boolean[][] marked){
        marked[sr][sc]=true;
        image[sr][sc]=newColor;
        for(int i=0;i<4;i++){
            int x=sr+posX[i];
            int y=sc+posY[i];
            if(x>=0&&x<image.length&&y>=0&&y<image[0].length&&image[x][y]==oldColor&&!marked[x][y]){
                dfs(image,x,y,newColor,oldColor,marked);
            }
        }
    }

    public static void main(String[] args) {
        int[][] image={{0,0,0},{0,1,1}};
        new solution733().floodFill(image,1,1,1);
    }
}