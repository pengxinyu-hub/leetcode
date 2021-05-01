public class solution64_dfs {
    public int minPathSum(int[][] grid) {
        // 深度优先搜索
        dfs(grid,0,0);
        return minValue;
    }

    // 全局变量，用于保存路径临时代价，和最小代价
    private int sum = 0, minValue = Integer.MAX_VALUE;

    // 深度优先搜索
    private void dfs(int[][] grid, int m, int n) {
        // 每走到一个单元格先加上“代价”
        sum += grid[m][n];
        // 沿着一条路走到底，就比较是不是最小值
        if (m==grid.length-1 && n==grid[0].length-1) {
            minValue = (minValue<=sum? minValue: sum);
            return;
        }
        // 向右还能走就继续走
        if (m<grid.length-1) {
            dfs(grid,m+1,n);
            //撤销选择
            sum -= grid[m+1][n];
        }
        // 向下还能走就继续走
        if (n<grid[0].length-1) {
            dfs(grid,m,n+1);
            sum -= grid[m][n+1];
        }
    }

    public static void main(String[] args) {
        int[][] p = {{1,3,1},{1,5,1},{4,2,1}};
        solution64_dfs solution64=new solution64_dfs();
        System.out.println(solution64.minPathSum(p));
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[0].length;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}
