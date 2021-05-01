public class solution52 {
    private int ans=0;
    public int totalNQueens(int n) {
        int[][] grid=new int[n][n];
        dfs(0,grid);
        return ans;
    }

    private void dfs(int row,int[][] grid){
        if(row==grid.length){
            ans++;
            return;
        }
        for(int i=0;i<grid.length;i++){
            if(!isValid(row,i,grid))  continue;
            grid[row][i]=1;
            dfs(row+1,grid);
            grid[row][i]=0;
        }
    }

    private boolean isValid(int row,int column,int[][] grid){
        for(int i=0;i<row;i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1 && (j == column || Math.abs(i - row) == Math.abs(j - column)))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new solution52().totalNQueens(4));
    }
}
