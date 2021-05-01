/*
给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。

示例 1：s

输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
输出：7
解释：因为路径 1→3→1→1→1 的总和最小。
示例 2：

输入：grid = [[1,2,3],[4,5,6]]
输出：12
 */
public class solution64 {
    public int minPathSum(int[][] grid) {
        for(int m=1;m< grid.length;m++){
            grid[m][0]+=grid[m-1][0];
        }
        for(int n=1;n<grid[0].length;n++){
            grid[0][n]+=grid[0][n-1];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]+=min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

    private int min(int i,int j){
        return i<j?i:j;
    }
    public static void main(String[] args) {
        int[][] p = {{1,3,1},{1,5,1},{4,2,1}};
        solution64 solution64=new solution64();
        System.out.println(solution64.minPathSum(p));
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[0].length;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}
