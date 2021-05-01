public class solution200 {
    int[] lr={-1,1,0,0};
    int[] ud={0,0,-1,1};
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i,int j,char[][] grid){
        if(i<0||i>= grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        for(int m=0;m<4;m++){
            dfs(i+lr[m],j+ud[m],grid);
        }
    }
}
